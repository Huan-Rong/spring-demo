package site.bulibucai.multiple.bean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfiguration {

    @Bean
    public Apple apple() {
        return new Apple();
    }
}
