package annotation.tv;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TVUser {

	public static void main(String[] args) {
		ApplicationContext factory = new ClassPathXmlApplicationContext("annotation/tv/tv.xml");
		for(String n : factory.getBeanDefinitionNames()) {
			System.out.println(n);
		}
		
		TV tv = (TV)factory.getBean("tv");
		if(tv != null) {
			tv.powerOn();
			tv.soundUp();
			tv.soundDown();
			tv.powerOff();			
		}
		
		TV tv2 = (TV)factory.getBean("tv");
		TV tv3 = (TV)factory.getBean("tv");
		TV tv4 = (TV)factory.getBean("tv");
	}

}
