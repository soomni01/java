package ch02.lecture.p03string;

public class C02Print {
    public static void main(String[] args) {
        // println : 한 줄에 출력후 끝에 엔터 출력
        System.out.println("안녕하세요.");

        // print : 한 줄에 출력
        System.out.print("반갑습니다.");
        System.out.print("월요일이네요.");

        // printf : 형식(format)에 맞춰서 출력
        System.out.printf("안녕");
        System.out.println();
        System.out.printf("이름은 %s", "손흥민");
        System.out.println();
        System.out.printf("이름은 %s", "이강인");
        System.out.println();

        String f = "이름은 %s";
        String name1 = "이정후";
        String name2 = "황희찬";

        System.out.printf("f, name1");
        System.out.println();
        System.out.printf("f, name2");
        System.out.println();

        // %n : 엔터(줄바꿈)
        System.out.printf("이름은 %s%n", "메시");
        System.out.printf("이름은 %s%n", "호나우두");

        System.out.printf("이름은 %s 나이는 %s%n", "린가드", "35");

        // %% : %
        System.out.printf("퍼센트 출력 %%%n");

        // \t : 탭 출력
        System.out.printf("탭\t출력%n");
        
    }
}
