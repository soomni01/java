package ch04.sec03;

public class SwitchNoBreakCaseExample {
    public static void main(String[] args) {
        // 8, 9, 10, 11
        int time = (int) (Math.random() * 4) + 8;
        System.out.println("[현재 시간 : " + time + "시");

        // expression 표현에서는 break가 자동으로 있으므로
        // break을 활용하려면 아래 case 형식 이용
        switch (time) {
            case 8:
                System.out.println("출근합니다.");
            case 9:
                System.out.println("회의를 합니다.");
            case 10:
                System.out.println("업무를 봅니다.");
            default:
                System.out.println("외근을 나갑니다.");
        }
    }
}
