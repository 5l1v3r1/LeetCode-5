package others;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by dss886 on 2016/4/20.
 * From the online written test of Alibaba 2016.
 */
public class DeliveryList {

    public Node[] sort(Node[] list) {
        mergeSortLoop(list);
        return deleteDuplicate(list);
    }

    private void mergeSortLoop(Node[] list) {
        Node[] result = new Node[list.length];
        for (int block = 1; block < list.length; block *= 2) {
            for (int start = 0; start < list.length; start += block * 2) {
                int end = start + 2 * block - 1;
                int mid = (end - start) / 2 + start;
                int start1 = start;
                int end1 = mid;
                int start2 = mid + 1;
                int end2 = end < list.length ? end : list.length - 1;

                int p = start;
                while (start1 <= end1 && start2 <= end2)
                    result[p++] = list[start1].time < list[start2].time ? list[start1++] : list[start2++];
                while(start1 <= end1) result[p++] = list[start1++];
                while(start2 <= end2) result[p++] = list[start2++];
            }
            System.arraycopy(result, 0, list, 0, list.length);
        }
    }

    private Node[] deleteDuplicate(Node[] list) {
        List<Node> nodeList = Arrays.asList(list);
        Set<String> set = new HashSet<>();
        for (int i = 0, size = nodeList.size(); i < size; ) {
            if (!set.add(nodeList.get(i).content)) {
                nodeList.remove(i);
                size--;
            } else {
                i++;
            }
        }
        Node[] results = new Node[nodeList.size()];
        nodeList.toArray(results);
        return results;
    }

    public class Node {
        public long time;
        public String content;
    }
}
