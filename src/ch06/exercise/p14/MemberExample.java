package ch06.exercise.p14;

public class MemberExample {
    public static void main(String[] args) {
        Member user1 = new Member("홍길동", "hong");
        user1.name = "son";

        user1.age = 12;

        System.out.println(user1);
    }
}
