package memberservice;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MemberMain {

	public static void main(String[] args) {
		// spring
		ApplicationContext factory = new ClassPathXmlApplicationContext("memberservice/member.xml");
//		String[] names = factory.getBeanDefinitionNames();
//		for(String n : names) {
//			System.out.println(n);
//		}
		
		MemberService service = (MemberService)factory.getBean("service");
		service.registerMember();
		service.login();
		
	}

}
