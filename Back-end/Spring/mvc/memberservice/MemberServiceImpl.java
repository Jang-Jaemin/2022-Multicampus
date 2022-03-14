package memberservice;

public class MemberServiceImpl implements MemberService {
	MemberDAO dao;
	MemberDTO dto;

	public void setDao(MemberDAO dao) {
		this.dao = dao;
	}
	
	public void setDto(MemberDTO dto) {
		this.dto = dto;
	}

	@Override
	public void registerMember() {
		int result = dao.selectMember(dto.getId(), dto.getPassword());
		if(result == 2) dao.insertMember(dto);
	}

	@Override
	public void login() {
		int result = dao.selectMember(dto.getId(), dto.getPassword());
		if(result == 0) System.out.println("정상 로그인 사용자입니다.");
		else System.out.println("비정상 사용자");
	}

}
