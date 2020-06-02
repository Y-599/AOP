package mypractice.config;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.METHOD,ElementType.TYPE})//可注解的地方
@Retention(RetentionPolicy.RUNTIME)//生命周期
public @interface Log {
    String value() default "";

}