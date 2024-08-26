package ch05.sec05;

public class SubStringExample {
    public static void main(String[] args) {
        String ssn = "880815-1234567";

        String firstNum = ssn.substring(0, 5);
        System.out.println(firstNum);

        // 7번째 문자부터 마지막 문자까지 추출
        String secondNum = ssn.substring(7);
        System.out.println(secondNum);
    }
}
