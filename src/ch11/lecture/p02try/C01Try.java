package ch11.lecture.p02try;

public class C01Try {
    public static void main(String[] args) {
        try {
            // exception이 발생할 것 같은 코드들
            int a = 3;
            int b = 0;
            int c = a / b; //ArithmeticException
        } catch (Exception e) {
            // exception 객체로 어떤 일을 함...

        }

        System.out.println("다음 코드");
    }
}
