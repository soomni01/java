package ch04.lecture.p02switch;

public class C07CurlyBracket {
    public static void main(String[] args) {
        // if, else if, else, case
        // 의 코드 블럭이 한 줄이면 중괄호 생략 가능
        // (단, 중괄호 생략 시 코드 읽기 어려울 땐 생략하지 말 것

        if (true) {
            // 중괄호 생략 안됨
            System.out.println(1);
            System.out.println(2);
        }

        // 중괄호 생략 가능
        if (true)
            System.out.println(3);

        // 중괄호 생략 가능
        if (true)
            System.out.println(4);
        else if (true)
            System.out.println(5);
        else
            System.out.println(6);

        //
        if (true)
            System.out.println(7);
        else if (true) {
            System.out.println(8);
            System.out.println(9);
        } else
            System.out.println(10);


        int n = 3;
        switch (n) {
            // 중괄호 생략 불가
            case 1 -> {
                System.out.println(1);
                System.out.println(2);
            }
            // 중괄호 생략 가능
            case 2 -> System.out.println(3);
        }
    }
}
