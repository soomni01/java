package ch12.lecture.p06annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

public class C03Annotation {
}

@MyAnnotation3
class MyClass3 {
    @MyAnnotation3
    private String name;

    @MyAnnotation3
    public MyClass3(@MyAnnotation3 String name) {
        this.name = name;
    }

    @MyAnnotation3
    public void method1(@MyAnnotation3 int b) {
        @MyAnnotation3
        int c = 3;
    }
}

//@Target({ElementType.FIELD, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@interface MyAnnotation3 {

}