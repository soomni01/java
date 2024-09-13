package ch11.lecture.p04checked;

public class C02CheckedException {
    public static void main(String[] args) {
        // checked exception (일반 예외)
        // : RuntimeException 을 상속받지 않은 클래스들의 객체
        //   컴파일러가 예외 처리 코드를 작성했는 지 체크함

        try {
            Class.forName("java.lang.String");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
