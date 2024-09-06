package ch15.lecture.p01list;

import java.util.ArrayList;

public class C01List {
    public static void main(String[] args) {
        // List : 요소(element)의 순서가 있는 컬렉션
        ArrayList<String> list = new ArrayList<>();

        // element 추가
        // add, set
        list.add("java");
        list.add("react");
        list.add(new String("css"));
        list.add("spring"); // 추가
        list.set(1, "vue"); // 교체
        list.add(2, "jsp"); // 특정 인덱스에 추가
        System.out.println(list);

        // element 얻기
        // get (0-indexed)
        String item1 = list.get(0);
        String item2 = list.get(2);
        System.out.println("item1 = " + item1);
        System.out.println("item2 = " + item2);

        // element 확인(검색)
        // contains
        boolean r1 = list.contains(new String("css"));
        boolean r2 = list.contains("html");
        System.out.println("r1 = " + r1);
        System.out.println("r2 = " + r2);

        // element 수 확인
        // size, isEmpty
        int size = list.size(); // element 갯수
        boolean r3 = list.isEmpty(); // 비어있는지?
        System.out.println("size = " + size);
        System.out.println("r3 = " + r3);
    }
}
