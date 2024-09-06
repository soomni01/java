package ch13.lecture.p03polymorphism;

public class C02BoundedTypeParameter {
}

// 타입파라미터에 넣을 수 있는 타입은 Object 또는 그 하위 타입
class MyClass2<T extends Object> {
    void action(T param) {
        System.out.println(param.toString());
        System.out.println(param.equals(null));
        System.out.println(param.hashCode());
    }
}
