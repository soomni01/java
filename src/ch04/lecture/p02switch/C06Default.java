package ch04.lecture.p02switch;

public class C06Default {
    public static void main(String[] args) {
        // 1~10 (정수)
        int n = (int) (Math.random() * 10) + 1;
        System.out.println("n = " + n);

        switch (n) {
            case 5:
            case 10:
                System.out.println("5의 배수 입니다. ");
                break;
            case 3:
            case 6:
            case 9:
                System.out.println("3의 배수 입니다.");
                break;
            default:
                System.out.println("그 외의 수들");
                break; // 마지막 break는 생략 가능

        }
    }
}
