package ch11.lecture.p02try;

public class C05Finally {
    public static void main(String[] args) {
        try {
            int[] arr = {3, 4};
            int a = arr[0]; // 예외 발생 가능

            System.out.println("a = " + a);
            return;
//            System.out.println("실해안됨");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // 심지어 return 되어도 실행
            System.out.println("꼭 실행되어야 하는 코드");
        }

        System.out.println("다음 실행 흐름...");
    }
}
