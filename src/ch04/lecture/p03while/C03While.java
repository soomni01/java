package ch04.lecture.p03while;

public class C03While {
    public static void main(String[] args) {
        int i = 1;
        while (i <= 10) {
            if ((i % 2) == 0) {
                System.out.println("i = " + i);
            }
            i++;
        }
    }
}
