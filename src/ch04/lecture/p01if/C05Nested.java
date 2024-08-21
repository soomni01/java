package ch04.lecture.p01if;

public class C05Nested {
    public static void main(String[] args) {
        // 제어문 내에 제어문 작성 가능

        if (true) {
            System.out.println(1);

            if (true) {
                System.out.println(2);
                System.out.println(3);
            } else {
                System.out.println(4);
            }
        }
        System.out.println(5);
        System.out.println(6);
    }
}
