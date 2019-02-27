package site.bulibucai.multiple.repository;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RepositoryConfiguration {

    @Bean
    public AppleRepository appleRepository(){
        return new AppleRepository();
    }

}
