package member;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MemberMain {

	public static void main(String[] args) {
		// non-spring
//		MemberDTO dto = new MemberDTO();
//		dto.setId("spring");
//		dto.setPassword("1234");
//		dto.setName("홍길동");
//		dto.setPhone("010-1111-2222");
//		dto.setEmail("spring@a.com");
//		dto.setAddress("서울");
//		
//		MemberDAO dao = new MemberDAO();
//		dao.setDto(dto);
//		boolean result = dao.selectMember();
//		if(result == true) {
//			System.out.println("정상 로그인 사용자입니다.");
//		} else {
//			dao.insertMember();
//		}
		
		// spring
		ApplicationContext factory = new ClassPathXmlApplicationContext("member/member.xml");
		MemberDAO dao = (MemberDAO)factory.getBean("dao");
		
		boolean result = dao.selectMember();
		if(result == true) {
			System.out.println("정상 로그인 사용자입니다.");
		} else {
			dao.insertMember();
		}
	}

}
