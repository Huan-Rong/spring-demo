package site.bulibucai;

import lombok.extern.java.Log;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import site.bulibucai.bean.Apple;
import site.bulibucai.bean.HelloSpring;
import site.bulibucai.config.ApplicationConfiguration;

@Log
public class Main {

    public static void main(String[] args) {
        ApplicationContext context =
                new AnnotationConfigApplicationContext(ApplicationConfiguration.class);
        HelloSpring helloSpring = context.getBean(HelloSpring.class);
        helloSpring.hello();

        Apple apple = context.getBean(Apple.class);
        Apple apple1 = (Apple) context.getBean("applel");
        System.out.println(apple.getColor());
        System.out.println(apple1.getColor());

    }
}
