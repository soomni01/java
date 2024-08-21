package ch04.lecture.p02switch;

public class C02Switch {
    public static void main(String[] args) {
        // 1, 2, 3
        int n = (int) (Math.random() * 3) + 1;

        // 고전적 switch
        switch (n) {
            case 1:
                System.out.println("첫번째");
                break;
            case 2:
                System.out.println("두번째");
                break;
            case 3:
                System.out.println("세번째");
                break;
        }
    }
}
