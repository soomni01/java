package ch06.exercise.p13;

public class MemberExample {
    public static void main(String[] args) {
        Member m1 = new Member();
        Member m2 = new Member();
        m1.name = "son";
        m2.name = "lee";

        m1.age = 12;
        m2.age = 20;

        System.out.println(m1);
        System.out.println(m2);
    }
}
