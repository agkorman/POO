package Guias.Guia6.Ej10_MultiSortedCollection;

public class Person {
    private final int age;
    private final String name;

    public Person(String n, int age) {
        this.name = n;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "%s # %d".formatted(name, age);
    }
}
