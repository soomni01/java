package programmers;

public class Solution {
    public int solution(String my_string) {

        // 문자열 계산하기
        // 예제 : 3 + 10 - 5 + 2 - 1 + 9
        String[] s = my_string.split(" ");

        int prev = Integer.parseInt(s[0]);
        for (int i = 1; i < s.length; i += 2) {
            String operator = s[i];

            switch (operator) {
                case "+" -> {
                    prev = prev + Integer.parseInt(s[i + 1]);
                }
                case "-" -> {
                    prev = prev - Integer.parseInt(s[i + 1]);
                }
            }

        }

        return prev;
    }
}