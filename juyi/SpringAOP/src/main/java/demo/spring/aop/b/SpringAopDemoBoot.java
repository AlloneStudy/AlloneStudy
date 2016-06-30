package demo.spring.aop.b;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@EnableAutoConfiguration
@ComponentScan(basePackages = "demo.spring.aop.b")
@ImportResource({ "classpath:config/b.xml"})
public class SpringAopDemoBoot implements CommandLineRunner {

	@Override
	public void run(String... args) throws Exception {

	}

	public static void main(String[] args) throws Exception {
		SpringApplication app = new SpringApplication(SpringAopDemoBoot.class);
		ConfigurableApplicationContext ctx = app.run(args);
		AspectBusiness  business = (AspectBusiness ) ctx.getBean("aspectBusiness");
		business.delete("猫");

		// ctx.close();

	}
}
