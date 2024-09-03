package programmers;

import java.util.Arrays;

public class Solution4 {
    public static void main(String[] args) {
        int hp = 23;
        int a = 5;
        int b = 3;
        int c = 1;
        int count = 0;
        boolean run = true;

        while (run) {
            if (hp >= 5) {
                count += hp / a;
                hp = hp % a;
                System.out.println(hp + ", " + count);

            } else if (hp >= 3) {
                count += hp / b;
                hp -= hp % b;
                System.out.println(hp + ", " + count);

            } else if (hp >= 1) {
                count = hp / c;
                hp = hp % c;
                System.out.println(hp + ", " + count);
              
            } else {
                run = false;
            }
        }

        System.out.println(hp + ", " + count);
    }


}


