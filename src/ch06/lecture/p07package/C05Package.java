package ch06.lecture.p07package;

public class C05Package {
    public static void main(String[] args) {
        // 클래스는 특정 패키지 내에 작성됨
        // 클래스의 full name은 패키지명까지 포함

        // 다른 패키지의 클래스 사용시 import 해서 사용해야함
        // 같은 패키지의 클래스 사용시 import 생략 가능

        // 패키지명 작성 관습
        // : lower_snake_case, (주로 한단어만 사용)

        // 패키지명 맨 앞에 각 회사의 도메인명을 거꾸로 붙임
        // com.ms.image.draw.Robot
        // com.google.image.draw.Robot
    }
}
