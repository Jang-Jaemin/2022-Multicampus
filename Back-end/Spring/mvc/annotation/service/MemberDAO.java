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

	public boolean selectMember(){
		if(dto.getId().equals("spring") && dto.getPassword().equals("1234")) {
			return true;
		}
		return false;
	}
	
	public void insertMember() {
		System.out.println(dto.getId() + " ȸ���� ���������� ȸ�����ԵǼ̽��ϴ�.");
	}
}
