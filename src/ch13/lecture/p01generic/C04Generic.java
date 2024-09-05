package ch13.lecture.p01generic;

public class C04Generic {
    public static void main(String[] args) {
        MyClass4<String> o1 = new MyClass4<>();
        MyClass4<Integer> o2 = new MyClass4<>();

        int i = 3;
        var j = 5;

        var o3 = new MyClass4<String>();
        var o4 = new MyClass4<Integer>();

    }
}

class MyClass4<T> {

}