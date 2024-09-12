package ch17.lecture.p03intermediate;

import java.util.List;

public class C01Filter {
    public static void main(String[] args) {
        // filter
        List<Integer> list = List.of(100, 200, 10, 20, 30, 300, 40);

        long count = list.stream() // 스트림 만들기
                .filter(e -> e >= 100 && e <= 999)// 중간 연산 (0개 이상)
                .count();// 최종 연산

        System.out.println("count = " + count);

        long count1 = list.stream()
                .filter(e -> e >= 10 && e < 100)
                .count();
        System.out.println("count1 = " + count1);

        // 고전적 반복문 사용
        int count2 = 0;
        for (Integer item : list) {
            if (item >= 100 && item < 1000) {
                count2++;
            }
        }
        System.out.println("count2 = " + count2);
    }
}
