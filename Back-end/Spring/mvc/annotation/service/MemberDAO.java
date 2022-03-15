package annotation.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class MemberDAO {
	@Autowired
	MemberDTO dto;

	public void setDto(MemberDTO dto) {
		this.dto = dto;
	}

	// java application 메인 실행 메소드
	public boolean selectMember(){
		if(dto.getId().equals("spring") && dto.getPassword().equals("1234")) {
			return true;
		}
		return false;
	}
	
	public void insertMember() {
		System.out.println(dto.getId() + " 회원님 정상적으로 회원가입 되셨습니다.");
	}
	
	// spring mvc 브라우저 입력 정보 받아 실행에 필요한 메소드 
	public boolean selectMember(MemberDTO dto){
		if(dto.getId().equals("spring") && dto.getPassword().equals("1234")) {
			return true;
		}
		return false;
	}
	
	public void insertMember(MemberDTO dto) {
		System.out.println(dto.getId() + " 회원님 정상적으로 회원가입 되셨습니다.");
	}
}
