package queue;

import java.util.LinkedList;
import java.util.Queue;

public class queueSample {

    public static void main(String[] args) {

        /*
        LinkedList was utilized, because Queue implements abstract methods.
         */

        Queue <Integer> q = new LinkedList<>();

        q.add(2);
        q.add(3);
        q.add(4);
        q.add(1);
        q.add(20);

        System.out.println("First: " + q.remove() + " Has been removed!");
        System.out.println("Second: " + q.remove() + " Has been removed!");

    }
}
