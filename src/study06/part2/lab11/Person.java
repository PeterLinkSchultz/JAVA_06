package study06.part2.lab11;

public class Person {
    private final String name;
    private final String surName;
    private final Integer age;

    public Person(String name, String surName, int age) {
        this.name = name;
        this.surName = surName;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getSurName() {
        return surName;
    }

    public Integer getAge() {
        return age;
    }
}
