package ch15.sec05.exam03;

import org.jetbrains.annotations.NotNull;

public class Person implements Comparable<Person> {
    public String name;
    public int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public int compareTo(@NotNull Person o) {
        if (age < o.age) return -1;
        else if (age == o.age) return 0;
        else return 1;
    }
}
