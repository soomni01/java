package ch13.lecture.p01generic;

public class C06typeParameter {
    public static void main(String[] args) {
        MyClass6<String, Integer> box1 = new MyClass6<>();
        var box2 = new MyClass6<Double, Long>();

        box1.setItem1("java");
        box1.setItem3(500);

        box2.setItem1(3.14);
        box2.setItem3(5L);

        String item1 = box1.getItem1();
        Integer item3 = box1.getItem3();

        Double item5 = box2.getItem1();
        Long item7 = box2.getItem3();
        ;
    }
}

class MyClass6<T, U> {
    private T item1;
    private U item3;

    public T getItem1() {
        return item1;
    }

    public void setItem1(T item1) {
        this.item1 = item1;
    }

    public U getItem3() {
        return item3;
    }

    public void setItem3(U item3) {
        this.item3 = item3;
    }
}
