package spring.ioc;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ImportResource;

import spring.ioc.bean.Grade;
@SpringBootApplication
@ComponentScan(basePackages = "spring.ioc.bean")
@ImportResource({ 
	"classpath:config/spring_bean.xml",
	"classpath:config/customer_bean.xml" 	
})

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
		
		//ctx.close();
		
	}
}
