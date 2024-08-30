package ch07.lecture.p06final;

public class C01FinalMethod {
}

class Fish1 {
    // final method : 자식클래스에서 재정의 못함
    final public void breate() {
        System.out.println("아가미로 호흡함");
    }

    public void swim() {
        System.out.println("헤엄칩니다.");
    }
}

class Domi1 extends Fish1 {

    // 안되도록 !!
//    @Override
//    public void breate() {
//        System.out.println("폐호흡합니다.");
//    }

    @Override
    public void swim() {
        System.out.println("천천히 헤엄칩니다.");
    }
}

class Tuna1 extends Fish1 {
    @Override
    public void swim() {
        System.out.println();
    }
}
