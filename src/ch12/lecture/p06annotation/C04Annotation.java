package ch12.lecture.p06annotation;

import java.lang.annotation.Annotation;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public class C04Annotation {
    public static void main(String[] args) {
        Class<MyClass4> c = MyClass4.class;
        Annotation[] annotations = c.getDeclaredAnnotations();
        System.out.println(annotations.length); // 1
    }
}

@MyAnnotation4
class MyClass4 {

}

@Retention(RetentionPolicy.RUNTIME) // 실행시간 까지
//@Retention(RetentionPolicy.CLASS) // 컴파일 까지 (기본값)
//@Retention(RetentionPolicy.SOURCE) // 컴파일 전까지
@interface MyAnnotation4 {
}