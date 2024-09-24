package ch12.lecture.p06annotation;

public class C05Element {
    @MyAnnotation5(name = "hello", age = 30)
    String name;

    @MyAnnotation5(age = 44, name = "world")
    public void method() {

    }
}

@interface MyAnnotation5 {
    // element (attribute)

    String name();

    int age();
}
