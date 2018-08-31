package ExamplesOfArrayOthers;

import java.util.LinkedList;
import java.util.Queue;

public class UseOfQueue {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<String>();
        queue.add("TN");
        queue.add("PA");
        queue.add("CA");
        queue.add("AZ");

        while(!queue.isEmpty()){
            System.out.println(queue.poll());
        }


    }

}
