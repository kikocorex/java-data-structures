package AbstractionJava;

abstract class Dog {
    public void bark() {
        System.out.println("ARF!!!!!");
    }
    public abstract void poop();
}

class Husky extends Dog {
    @Override
    public void poop() {
        System.out.println("HUSKY POOPED!");
    }
}

public class SampleAbstraction {

    public static void main(String[] args) {

        Husky h = new Husky();

        h.bark();
        h.poop();


    }
}
