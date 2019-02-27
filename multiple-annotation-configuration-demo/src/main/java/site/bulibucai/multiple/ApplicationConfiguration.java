package site.bulibucai.multiple;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import site.bulibucai.multiple.autoscancomponent.MarkerInterface;
import site.bulibucai.multiple.bean.BeanConfiguration;
import site.bulibucai.multiple.repository.RepositoryConfiguration;

@Configuration
@Import({BeanConfiguration.class, RepositoryConfiguration.class})
@ComponentScan(basePackageClasses = MarkerInterface.class)
public class ApplicationConfiguration {
}
