package spring.ioc.bean;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

@Component
public class InitSequenceBean implements InitializingBean, DisposableBean {

	public InitSequenceBean() {
		System.out.println("InitSequenceBean: constructor");
	}

	@PostConstruct
	
	public void postConstruct() {
		System.out.println("InitSequenceBean: postConstruct");
	}
	@PreDestroy
	public void preDestroy() {
		System.out.println("InitSequenceBean: preDestroy");
	}

	public void initMethod() {
		System.out.println("InitSequenceBean: init-method");
	}
	
	public void destroyMethod() {
		System.out.println("InitSequenceBean: destroy-method");
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("InitSequenceBean: afterPropertiesSet");
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("InitSequenceBean: destroy");
	}
}