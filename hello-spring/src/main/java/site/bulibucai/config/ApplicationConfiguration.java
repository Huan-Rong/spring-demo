package site.bulibucai.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import site.bulibucai.MarkerInterface;
import site.bulibucai.bean.Apple;

@Configuration
@ComponentScan(basePackageClasses = MarkerInterface.class)
public class ApplicationConfiguration {

    @Bean
    public Apple applel() {
        Apple apple = new Apple();
        apple.setColor("RED");
        return apple;
    }

}
