package ch06.lecture.p04constructor;

public class C05This {
    public static void main(String[] args) {
        MyClass05 o = new MyClass05();
        MyClass05 p = new MyClass05();
        o.name = "lee";
        p.name = "son";
        o.printName();
        p.printName();

        System.out.println();
        p.printFullDesCription();
        o.printFullDesCription();
    }
}

class MyClass05 {
    int score;
    String name;

    void printName() {
        System.out.println(this.name);
    }

    void printFullDesCription() {
        this.printName();
        System.out.println(this.score);
    }
}
