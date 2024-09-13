package ch11.lecture.p02try;

public class C03Try {
    public static void main(String[] args) {
        try {
            int a = 5;
            int b = 0;

            int c = a / b; // Exception 발생 가능

            // try 블럭 내의 다음 코드들...
            System.out.println("c = " + c);
        } catch (Exception e) {
            // catch 블럭 내의 코드들...
            e.printStackTrace();
        }

        // 다음 실행 흐름...
        System.out.println("다음 코드들...");
    }
}
