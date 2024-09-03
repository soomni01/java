package ch16.lecture.p01lambda;

public class C05MethodBody {
    public static void main(String[] args) {
        // 메소드 몸통(코드블럭)내의
        // 명령문이 1줄이 아니면
        //  {} 붙여야함
        MyInterface5 o = () -> {
            System.out.println("명령문1");
            System.out.println("명령문2");
        };
        o.some();

        // 명령문이 1줄이면 {} 중괄호 생략 가능
        MyInterface5 p = () -> {
            System.out.println("한 줄");
        };
        p.some();

        MyInterface5 q = () -> System.out.println("one line");
        q.some();
    }
}

@FunctionalInterface
interface MyInterface5 {
    void some();
}
