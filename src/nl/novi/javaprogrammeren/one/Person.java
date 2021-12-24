package nl.novi.javaprogrammeren.one;

public class Person {

    private int age;
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void ageOneYear() {
        this.age++;
    }
}
