package ro.fasttrackit.lab7.tema;

public class Person {
    private String name;
    private int age;
    private boolean married;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    boolean isMarried() {
        return married;
    }
}
