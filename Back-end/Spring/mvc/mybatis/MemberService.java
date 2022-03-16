package mybatis;

public interface MemberService {
	public int insertmember(MemberDTO dto);
	public int updatemember(MemberDTO dto);
	public int deletemember(String id);
}
