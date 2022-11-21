package extra;

import java.util.ArrayDeque;
import java.util.Deque;

public class dequeSample {
    public static void main(String[] args) {

        /*
        With deque (deck), you can insert/remove in first node as well as last node
         */

        Deque<Integer> d = new ArrayDeque<>();

        d.add(12);

        d.addFirst(2);

        d.addLast(3);

        d.add(4);

        d.removeLast();

        System.out.println(d);

    }
}
