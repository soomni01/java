package ch03.sec01;

public class IncreaseDecreaseOperatorExample {
    public static void main(String[] args) {
        int x = 10;
        int y = 10;
        int z;

        x++;
        ++x;
        System.out.println("x = " + x);

        System.out.println("-----------------");
        y--;
        --y;
        System.out.println("y = " + y);

        System.out.println("-----------------");
        z = x++;
        System.out.println("z = " + z);
        System.out.println("x = " + x);

        System.out.println("-----------------");
        z = ++x;
        System.out.println("z = " + z);
        System.out.println("x = " + x);

        System.out.println("-----------------");
        z = ++x + y++; // 이런 코드는 사용 x
        System.out.println("z = " + z);
        System.out.println("x = " + x);
        System.out.println("y = " + y);

//        z = ++x + y++ 과 같은 코드는 아래와 같이 작성하는 것이  낫다.
//        x++;
//        z = x+y;
//        y++
    }
}
