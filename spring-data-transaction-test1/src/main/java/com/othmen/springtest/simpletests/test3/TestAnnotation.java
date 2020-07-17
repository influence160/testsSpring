package com.othmen.springtest.simpletests.test3;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.sql.DataSource;

import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AdviceMode;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.Ordered;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.othmen.springtest.simpletests.test3.entity.Foo;
import com.othmen.springtest.simpletests.test3.services.FooService;

@Configuration
@ComponentScan(basePackageClasses = TestAnnotation.class)
@EnableTransactionManagement(mode = AdviceMode.PROXY, proxyTargetClass = false, order = Ordered.LOWEST_PRECEDENCE)
@PropertySource("classpath:datasource.properties")
public class TestAnnotation {

	//Test @Transactional + @EnableTransactionManagement 
	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(TestAnnotation.class);
		
		FooService fooService = ctx.getBean(FooService.class);

		try {
			fooService.getFoo("aa");
		} catch (RuntimeException e) {
			System.out.println("exception fooService.getFoo");
			e.printStackTrace();
		}
		fooService.insertFoo(new Foo(1, "aaa"));
	}
	
	@Bean
	public static PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer() {
		PropertySourcesPlaceholderConfigurer configurer = new PropertySourcesPlaceholderConfigurer();
		return configurer;
	}
	
	
	@Bean
	public PlatformTransactionManager transactionManager(DataSource datasource) {
		return new org.springframework.jdbc.datasource.DataSourceTransactionManager(datasource);
	}

	@Bean
	public DataSource datasource() {
		BasicDataSource datasource = new org.apache.commons.dbcp2.BasicDataSource() {

			@Value("${datasource.driverClassName}")
			private String a;
			@Value ("${datasource.url}")
			private String b;
			@Value("${datasource.username}")
			private String c;
			@Value("${datasource.password}")
			private String d;
			
			@PostConstruct
			public void inittt() {
				setDriverClassName(a);
				setUrl(b);
				setUsername(c);
				setPassword(d);
			}
			
		
		};
		return datasource;
	}
	
}
