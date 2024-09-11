package ch15.lecture.p07stack;

import java.util.Stack;

public class C01Stack {
    public static void main(String[] args) {
        // STACK(LIFO, Last In First Out)

        Stack<String> stack = new Stack<>();

        // push : 원소 추가
        stack.push("java");
        stack.push("css");
        stack.push("react");
        stack.push("vue");
        stack.push("sql");
        stack.push("css");

        // pop : 원소 꺼내기
        String item1 = stack.pop();
        System.out.println("item1 = " + item1);
        String itme2 = stack.pop();
        System.out.println("itme2 = " + itme2);

        // 확인하기
        // size : 원소 수
        int size = stack.size();
        System.out.println("size = " + size);
        // peek : 마지막 원소 확인
        String item3 = stack.peek();
        System.out.println("item3 = " + item3);
        System.out.println("stack.size() = " + stack.size());
    }
}
