package stack;

import java.util.Stack;

public class stackSample {

    public static void main(String[] args) {

        Stack<Integer> s = new Stack<>();

        s.push(2);
        s.push(83);
        s.push(22);
        s.push(30);
        s.push(1);
        s.push(98);

        // Last/top element will always print first!

        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());







    }
}
