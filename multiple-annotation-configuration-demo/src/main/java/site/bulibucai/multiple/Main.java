package site.bulibucai.multiple;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import site.bulibucai.multiple.bean.Apple;
import site.bulibucai.multiple.repository.AppleRepository;

public class Main {

    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(ApplicationConfiguration.class);
        Apple apple = applicationContext.getBean(Apple.class);
        AppleRepository appleRepository = applicationContext.getBean(AppleRepository.class);
        System.out.println(apple);
        System.out.println(appleRepository);
    }
}
