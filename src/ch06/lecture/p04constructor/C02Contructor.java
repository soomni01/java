package ch06.lecture.p04constructor;

public class C02Contructor {
    public static void main(String[] args) {
        Myclass02 o1 = new Myclass02();
        System.out.println(o1.age);
        System.out.println(o1.name);
    }
}

class Myclass02 {
    // 필드
    int age;
    String name;

    // 생성자
    Myclass02() {
        // 인스턴스 생성시 처음 해야하는 일
        // 주로 필드 초기화 코드
        age = 1;
        name = "guest";
    }
}
