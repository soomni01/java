package ch15.exercise.p8;

import java.util.Objects;

public class Student {
    public int studentNum;
    public String name;

    public Student(int studentNum, String name) {
        this.studentNum = studentNum;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentNum=" + studentNum +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Student)) return false;
        Student student = (Student) obj;
        if (studentNum != student.studentNum) return false;
        return true;
    }

    @Override
    public int hashCode() {
        return studentNum;
    }
}