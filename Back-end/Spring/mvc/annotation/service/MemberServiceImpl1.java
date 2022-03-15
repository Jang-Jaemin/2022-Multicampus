package annotation.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("service")
public class MemberServiceImpl1 implements MemberService {
	@Autowired
	MemberDAO dao;
	
	@Override
	public void registerMember() {
		boolean result = dao.selectMember(); 
		if(!result) {
			dao.insertMember();
		}
		
	}

	@Override
	public void login() {
		boolean result = dao.selectMember();
		if(result) {
			System.out.println("정상 로그인 사용자");
		}
		else {
			System.out.println("비정상 로그인 사용자");			
		}
		
	}
	
	@Override
	public String registerMember(MemberDTO dto) {
		boolean result = dao.selectMember(dto); 
		if(!result) {
			dao.insertMember(dto);
			return "회원가입 되셨습니다.";
		}
		return "회원가입을 할 수 없습니다.";
	}

	@Override
	public boolean login(MemberDTO dto) {
		boolean result = dao.selectMember(dto);
		if(result) {
			System.out.println("정상 로그인 사용자");
		}
		else {
			System.out.println("비정상 로그인 사용자");			
		}
		return result;
		
	}

}
