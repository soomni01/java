package ch12.lecture.p06annotation;

public class C07Element {
    // 기본값 사용 name="son", age=1
    @MyAnnotation7
    int a;

    @MyAnnotation7(name = "son", age = 1) // 위나 아래나 같음
    int b;

    @MyAnnotation7(name = "kim")
    int c;
}

@interface MyAnnotation7 {
    // element 기본값
    String name() default "son";

    int age() default 1;
}
