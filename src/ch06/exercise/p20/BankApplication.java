package ch06.exercise.p20;

import java.util.Scanner;

public class BankApplication {
    public static void main(String[] args) {
        Account[] accountList = new Account[100];
        int customerNumber = 0;

        Scanner scanner = new Scanner(System.in);

        boolean run = true;
        while (run) {
            System.out.print("""
                    -----------------------------------
                    1.계좌생성|2.목록|3.예금|4.출금|5.종료
                    -----------------------------------
                    """);
            System.out.print("선택>");
            String menu = scanner.nextLine();

            switch (menu) {
                case "1" -> {
                    //계좌생성
                    System.out.print("""
                            -------
                            계좌생성
                            -------
                            """);
                    System.out.print("계좌번호:");
                    String number = scanner.nextLine();
                    System.out.print("계좌주:");
                    String name = scanner.nextLine();
                    System.out.print("초기입금액:");
                    int money = Integer.parseInt(scanner.nextLine());

                    Account account = new Account(number, name, money);
                    accountList[customerNumber] = account;
                    customerNumber++;

                    System.out.println("결과: 계좌가 생성되었습니다.");
                }
                case "2" -> {
                    // 목록 출력
                    System.out.print("""
                            -------
                            계좌목록
                            -------
                            """);
                    for (int i = 0; i < customerNumber; i++) {
                        String number = accountList[i].getNumber();
                        String name = accountList[i].getName();
                        int money = accountList[i].getBalance();

                        System.out.println(STR."\{number}   \{name}   \{money}");
                    }
                }
                case "3" -> {
                    // 예금
                    System.out.print("""
                            -------
                            예금
                            -------
                            """);
                    System.out.print("계좌번호:");
                    String number = scanner.nextLine();
                    System.out.print("예금액:");
                    int money = Integer.parseInt(scanner.nextLine());

                    // 계좌번호에 맞는 account 객체 찾기
                    for (int i = 0; i < customerNumber; i++) {
                        String n = accountList[i].getNumber();
                        if (number.equals(n)) {
                            // 예금액 더해주기
                            int current = accountList[i].getBalance();
                            accountList[i].setBalance(current + money);
                            System.out.println("결과: 예금이 성공되었습니다.");
                            break;
                        }
                    }
                }
                case "4" -> {
                    // 출금
                    System.out.print("""
                            -------
                            출금
                            -------
                            """);
                    System.out.print("계좌번호:");
                    String number = scanner.nextLine();
                    System.out.print("출금액:");
                    int money = Integer.parseInt(scanner.nextLine());

                    // 계좌번호에 맞는 account 객체 찾기
                    for (int i = 0; i < customerNumber; i++) {
                        String n = accountList[i].getNumber();
                        if (number.equals(n)) {
                            // 출금액 빼주기
                            int current = accountList[i].getBalance();
                            accountList[i].setBalance(current - money);
                            System.out.println("결과: 출금이 성공되었습니다.");
                            break;
                        }
                    }

                }
                case "5" -> {
                    // 종료
                    run = false;
                    System.out.println("프로그램 종료");
                }
            }
        }
    }
}