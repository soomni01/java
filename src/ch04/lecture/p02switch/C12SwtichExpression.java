package ch04.lecture.p02switch;

public class C12SwtichExpression {
    public static void main(String[] args) {
        int n = (int) (Math.random() * 3) + 1;

        String g = switch (n) {
            case 1 -> "일";
            case 2 -> {
                // 여러 명령문 작성 후 값 산출 시
                // 마지막에 yield 문 작성
                String a = "이";
                String b = "등급";
                yield a + b;
            }
            case 3 -> "삼";
            default -> "그외";
        };
    }
}
