package annotation.service;

public interface MemberService {
	void registerMember();
	void login();
	
	// spring mvc 실행
	String registerMember(MemberDTO dto);
	boolean login(MemberDTO dto);
}
