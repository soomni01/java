package ch16.sec01;

public class LambdaExample {
    public static void main(String[] args) {
        // 익명클래스 객체
        Calcuable c = new Calcuable() {
            @Override
            public void calculate(int x, int y) {
                System.out.println(x * y);
            }
        };
        // 객체 참조값 전달
        action(c);

        // 익명클래스 객체의 참조값 전달
        action(new Calcuable() {
            @Override
            public void calculate(int x, int y) {
                System.out.println(x / y);
            }
        });

        // 람다 전달
        action((int x, int y) -> {
            System.out.println(x + y);
        });

        //
        action((x, y) -> {
            int result = x + y;
            System.out.println("result = " + result);
        });

        action((x, y) -> {
            int result = x - y;
            System.out.println("result = " + result);
        });
    }

    public static void action(Calcuable calculable) {
        calculable.calculate(10, 4);
    }
}