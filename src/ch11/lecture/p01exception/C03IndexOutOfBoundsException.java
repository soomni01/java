package ch11.lecture.p01exception;

import java.util.List;

public class C03IndexOutOfBoundsException {
    public static void main(String[] args) {
        List<Integer> list = List.of(3, 4, 5);
        Integer i1 = list.get(2); // ok
        Integer i2 = list.get(3); // x

        System.out.println("다음 코드");

    }
}
