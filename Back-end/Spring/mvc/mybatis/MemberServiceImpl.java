package mybatis;

public class MemberServiceImpl implements MemberService {

	MemberDAO dao;
	
	public void setDao(MemberDAO dao) {
		this.dao = dao;
	}
	
	@Override
	public int insertmember(MemberDTO dto) {
		return dao.insertmember(dto);
	}


	@Override
	public int updatemember(MemberDTO dto) {
		return dao.updatemember(dto);
	}

	@Override
	public int deletemember(String id) {
		return dao.deletemember(id);
	}

}
