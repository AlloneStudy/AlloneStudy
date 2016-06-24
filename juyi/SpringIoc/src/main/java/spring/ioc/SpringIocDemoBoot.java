package spring.ioc;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ImportResource;

import spring.ioc.bean.Grade;
import spring.ioc.bean.Student;
@SpringBootApplication
@ComponentScan(basePackages = "spring.ioc.bean")
@ImportResource({ "classpath*:spring/**/*-config*.xml" })
public class SpringIocDemoBoot implements CommandLineRunner {

	@Override
	public void run(String... args) throws Exception {
		
	}
	public static void main(String[] args) throws Exception {
		SpringApplication app = new SpringApplication(SpringIocDemoBoot.class);
		ConfigurableApplicationContext ctx = app.run(args);
		Grade grade = (Grade) ctx.getBean("grade");
		//Student stu = grade.getStudent();
		
		System.out.println(grade);
		
	}
}
