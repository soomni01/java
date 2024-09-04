package ch12.lecture.p01object;

public class C06Hashcode {
    public static void main(String[] args) {
        MyClass6 o1 = new MyClass6("this is java");
        MyClass6 o2 = new MyClass6("this is java");

        boolean r1 = o1.equals(o2);
        System.out.println("r1 = " + r1);

        int h1 = o1.hashCode();
        int h2 = o2.hashCode();
        System.out.println("h1 = " + h1);
        System.out.println("h2 = " + h2);
    }
}


class MyClass6 {
    private String title;

    public MyClass6(String title) {
        this.title = title;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof MyClass6 other) {
            return title.equals(other.title);
        }
        return false;
    }

    // equals가 true면 hashcode 값은 같아야함

    @Override
    public int hashCode() {
        return title.hashCode();
    }
}
