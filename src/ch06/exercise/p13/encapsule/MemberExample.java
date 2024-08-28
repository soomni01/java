package ch06.exercise.p13.encapsule;

// 13번 문제 캡슐화
public class MemberExample {
    public static void main(String[] args) {
        Member m1 = new Member();
        m1.setName("lee");
        m1.setId("L");
        m1.setPassword("123");
        m1.setAge(15);

        System.out.println(m1.getName());
        System.out.println(m1.getId());
        System.out.println(m1.getPassword());
        System.out.println(m1.getAge());

    }
}
