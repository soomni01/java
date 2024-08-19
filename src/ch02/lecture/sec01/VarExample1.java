package ch02.lecture.sec01;

public class VarExample1 {
    public static void main(String[] args) {
        String name = getData();
        var userName = getData();
    }

    public static String getData() {
        return "홍길동";
    }
}
