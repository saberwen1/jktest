package com.fate.jktest.anno;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Repeatable(Person.class)
@Target(ElementType.TYPE)
public @interface MyAnno {
    String value() default "star";
    int age() default 0;
}
