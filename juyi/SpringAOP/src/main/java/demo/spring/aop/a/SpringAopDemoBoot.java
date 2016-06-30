package demo.spring.aop.a;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@EnableAutoConfiguration
@ComponentScan(basePackages = "demo.spring.aop.a")
@ImportResource({ "classpath:config/a.xml"})
public class SpringAopDemoBoot implements CommandLineRunner {

	@Override
	public void run(String... args) throws Exception {

	}

	public static void main(String[] args) throws Exception {
		SpringApplication app = new SpringApplication(SpringAopDemoBoot.class);
		ConfigurableApplicationContext ctx = app.run(args);
		IBaseBusiness business = (IBaseBusiness) ctx.getBean("businessProxy");
		business.delete("猫");

		// ctx.close();

	}
}
