package ch02.lecture.p04conversion;

public class VarExample1 {
    public static void main(String[] args) {
        String name = getData();
        var userName = getData();
    }

    public static String getData() {
        return "홍길동";
    }
}
