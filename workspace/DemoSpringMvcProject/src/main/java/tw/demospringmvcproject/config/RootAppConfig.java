package tw.demospringmvcproject.config;

import java.io.IOException;
import java.util.Properties;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;

import com.zaxxer.hikari.HikariDataSource;

//@Configuration
public class RootAppConfig {

	@Bean
	public DataSource dataSource() {
//		DriverManagerDataSource ds = new DriverManagerDataSource();
//		JndiObjectFactoryBean jofb = new JndiObjectFactoryBean();
		HikariDataSource ds = new HikariDataSource();
		ds.setDriverClassName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
		ds.setJdbcUrl(
				"jdbc:sqlserver://localhost:1433;databaseName=LeonPower;encrypt=true;trustServerCertificate=true");
		ds.setUsername("watcher");
		ds.setPassword("P@ssw0rd");
		ds.setMaximumPoolSize(10);
		return ds;
	}

	@Bean(name = "entityManagerFactory")
	public LocalSessionFactoryBean sessionFactory() throws IOException {
		LocalSessionFactoryBean factory = new LocalSessionFactoryBean();
		factory.setDataSource(dataSource());
		factory.setPackagesToScan("tw.demospringmvcproject");
		factory.setHibernateProperties(addProperties());
		factory.afterPropertiesSet();
		return factory;
	}

	// 只是物件不需要BEAN
	private Properties addProperties() {
		Properties props = new Properties();
//		props.put("hibernate.dialect", "org.hibernate.dialect.SQLServerDialect");
		props.put("hibernate.show_sql", "true");
		props.put("hibernate.format_sql", "true");
		props.put("hibernate.allow_update_outside_transaction", "true");
		return props;
	}

	public HibernateTransactionManager transactionManager() throws IOException {
		HibernateTransactionManager txMgr = new HibernateTransactionManager();
		txMgr.setSessionFactory(sessionFactory().getObject());
		return txMgr;
	}
}
