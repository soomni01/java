package ch05.lecture.p06enum;

public class C02Enum {
    public static void main(String[] args) {
        Enum2 season = Enum2.FALL;

        if (season.equals(Enum2.FALL)) {
            System.out.println("가을에 관련된 코드들");
        }

        switch (season) {
            case SPRING -> {
            }
            case SUMMER -> {
            }
            case FALL -> {
            }
            case WINTER -> {
            }
        }
    }
}

enum Enum2 {
    SPRING,
    SUMMER,
    FALL,
    WINTER
}
