package tw.demospringmvcproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceTransactionManagerAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;

//使用springdatajpa就不用exclude了
//RootAppConfig也不用@Configuration
@SpringBootApplication(exclude = { DataSourceAutoConfiguration.class,
		DataSourceTransactionManagerAutoConfiguration.class, HibernateJpaAutoConfiguration.class })

//@SpringBootApplication
public class DemoSpringMvcProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoSpringMvcProjectApplication.class, args);
	}

}
