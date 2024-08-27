package ch06.lecture.p04constructor;

public class C07Overloading {
    public static void main(String[] args) {
        MyClase07 o = new MyClase07(1, 44, "son", "seoul");
        MyClase07 p = new MyClase07(2, 55);
    }
}

class MyClase07 {
    int id;
    int age;
    String name;
    String address;

    MyClase07(int id, int age, String name, String address) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.address = address;
    }

    MyClase07(int id, int age) {
        this.id = id;
        this.age = age;
    }

    MyClase07(String name, String address) {
        this.name = name;
        this.address = address;
    }
}
