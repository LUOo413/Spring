package tw.demospringmvcproject.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

//@Configuration
//@ComponentScan(basePackages= {"tw.demospringmvcproject"})
public class WebAppConfig {
	
	@Bean
	public InternalResourceViewResolver viewResolver() {
    	InternalResourceViewResolver irvr1 = new InternalResourceViewResolver("/WEB-INF/pages/", ".jsp");
    	irvr1.setOrder(6);
    	return irvr1;
    }
	

}
