package ch12.lecture.p07record;

public class C03Record {
    public static void main(String[] args) {
        Book3 b1 = new Book3("java", 3000);
        b1.method1();

        System.out.println(b1 instanceof Object);
    }
}

// 보통의 클래스처럼 사용 가능
// equals, hashCode, toString 메소드는 이미 재정의되어 있음
record Book3(
        String title,
        int price
) {
    public void method1() {
        System.out.println("Book3.method1");
    }
}
