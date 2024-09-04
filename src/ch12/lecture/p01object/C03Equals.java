package ch12.lecture.p01object;

public class C03Equals {
    public static void main(String[] args) {
        Book3 b1 = new Book3("이것이 자바다");
        Book3 b2 = new Book3("모두의 git");
        Book3 b3 = new Book3("이것이 자바다");

        boolean r1 = b1.equals(b2);
        System.out.println("r1 = " + r1);

        boolean r2 = b1.equals(b3);
        System.out.println("r2 = " + r2);
    }
}

class Book3 {
    private String title;

    public Book3(String title) {
        this.title = title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    // equals
    // 이 객체와 다른 객체가 같은 지 알려주는 코드

    @Override
    public boolean equals(Object obj) {
        // obj가 Book3 타입의 객체이고
        // 이 객체의 title과 obj의 title이 같으면
        // true를 리턴
        if (obj instanceof Book3 other) {
            if (this.title.equals(other.title)) {
                return true;
            } else {
                return false;
            }
        }
        return false;
    }
}


