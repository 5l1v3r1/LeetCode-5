package algorithm.others;

/**
 * Created by dss886 on 16/9/12.
 *
 * Using volatile to ensure Safe-Double-Checked-Locking Singleton needs JDK5+
 */
public class Singleton {

    private static volatile Singleton instance;

    private Singleton() {}

    public static Singleton getInstance() {
        if (instance == null) {
            synchronized(Singleton.class) {
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
}
