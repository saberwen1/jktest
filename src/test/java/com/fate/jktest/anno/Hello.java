package com.fate.jktest.anno;

@MyAnno("tom")
@MyAnno("Dio")
@MyAnno
public class Hello {

    public static void main(String[] args) {
        Hello hello = new Hello();
        if (Hello.class.isAnnotationPresent(MyAnno.class)) {
            MyAnno[] annotationsByType = Hello.class.getAnnotationsByType(MyAnno.class);
            for (MyAnno myAnno : annotationsByType) {
                System.out.println(myAnno.value()+myAnno.age());
            }
        }else {
            System.out.println(Hello.class.isAnnotationPresent(MyAnno.class));
        }
    }
}
