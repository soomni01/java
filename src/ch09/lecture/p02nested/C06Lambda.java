package ch09.lecture.p02nested;

public class C06Lambda {
    public static void main(String[] args) {
        int a = 5;
        MyInterface6 o = () -> {
            // local class에서
            // 감싸고 있는 메소드의 지역변수(파라미터)의 값을 변경할 수 없음
//            a = 7;
        };
        // effectively final 이어서 한 변경 불가
//        a = 8;
        o.someAction();
    }
}

interface MyInterface6 {
    void someAction();
}
