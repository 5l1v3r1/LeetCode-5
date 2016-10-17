package company.microsoft;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by dss886 on 2016/10/10.
 * From the online written test of Microsoft 2016/10/10.
 *
 * This solution is TLE, create objects is too slow
 */
public class RegistrationDay {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        int K = scanner.nextInt();
        Student[] students = new Student[N];
        Task[] finalTasks = new Task[N];
        for (int n = 0; n < N; n++) {
            Student student = new Student();
            student.id = scanner.nextInt();
            int time = scanner.nextInt() + K;
            int P = scanner.nextInt();
            for (int p = 0; p < P; p++) {
                Task task = new Task();
                task.student = n;
                task.office = scanner.nextInt() - 1;
                task.start = time;
                task.period = scanner.nextInt();
                time += task.period + K;
                student.tasks.add(task);
            }
            finalTasks[n] = student.tasks.get(student.tasks.size() - 1);
            students[n] = student;
        }
        Office[] offices = new Office[M];
        for (int m = 0; m < M; m++) {
            offices[m] = new Office();
        }
        dispatchStudent(offices, students);
        printFinalTime(finalTasks);
    }

    private static void printFinalTime(Task[] finalTasks) {
        for (Task task : finalTasks) {
            System.out.println(task.start + task.period);
        }
    }


    private static void dispatchStudent(Office[] offices, Student[] students) {
        Student nowStudent = null;
        for (Student student : students) {
            if (student.tasks.size() == 0) continue;
            if (nowStudent == null) {
                nowStudent = student;
                continue;
            }
            int minTime = nowStudent.tasks.get(0).start;
            int time = student.tasks.get(0).start;
            if (time < minTime || (time == minTime && student.id < nowStudent.id)) {
                nowStudent = student;
            }
        }
        if (nowStudent == null) return;
        Office office = offices[nowStudent.tasks.get(0).office];
        Task task = nowStudent.tasks.get(0);
        if (office.tasks.size() != 0) {
            Task lastTask = office.tasks.get(office.tasks.size() - 1);
            int startTime = lastTask.start + lastTask.period;
            int offset = task.start >= startTime ? 0 : startTime - task.start;
            for (Task tempTask : nowStudent.tasks) {
                tempTask.start += offset;
            }
        }
        office.tasks.add(task);
        nowStudent.tasks.remove(0);
        dispatchStudent(offices, students);
    }


    private static class Task {
        int student;
        int office;
        int start;
        int period;
    }

    private static class Office {
        List<Task> tasks = new ArrayList<>();
    }

    private static class Student {
        int id;
        List<Task> tasks = new LinkedList<>();
    }
}
