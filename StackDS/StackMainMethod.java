package StackDS;

public class StackMainMethod {
    public static void main(String[] args) throws StackException {

        // StackImplementation s = new StackImplementation();
        StackImplementation s = new DynamicStackImplementation();

        s.push(1);
        s.push(2);
        s.push(10);
        s.push(10);
        s.push(10);
        s.push(10);
        s.push(10);
        s.push(10);
        s.push(10);
        s.push(10);
        s.push(10);

        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());






    }
}
