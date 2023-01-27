package OOPJava;

public class Person implements Human{
    private String name;
    private int age;
    private String gen;
    private String bday;
    private double weight;

    Person(String name, int age, String gen, String bday, double weight) {
        this.name = name;
        this.age = age;
        this.gen = gen;
        this.bday = bday;
        this.weight = weight;
    }


    @Override
    public void setName(String name) {
        this.name = name;
        System.out.println("Name set successfully!");

    }

    public String getName() {
        return name;
    }

    @Override
    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    @Override
    public void setGender(String gen) {
        this.gen = gen;
    }

    public String getGender() {
        return gen;
    }

    @Override
    public void setBirthday(String bday) {
        this.bday = bday;
    }

    public String getBirthday() {
        return bday;
    }

    @Override
    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }
}
