package ch11.lecture.p02try;

public class C06Finally {
    public static void main(String[] args) {
        try {
            System.out.println("실행 코드");
            return;
        } finally {
            System.out.println("꼭 실행되어야 하는 코드");
        }
    }
}
