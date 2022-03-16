package mybatis;

import org.apache.ibatis.session.SqlSession;

public class MemberDAO {
	SqlSession session;

	public void setSession(SqlSession session) {
		this.session = session;
	}
	
	// 저장
	public int insertmember(MemberDTO dto) {
		int insertrow = session.insert("insertmember", dto);
		return insertrow;
	}
	
	// 수정
	public int updatemember(MemberDTO dto) {
		return session.update("updatemember", dto);
	}
	
	// 삭제
	public int deletemember(String id) {
		return session.delete("deletemember", id);
	}
	
	// 전체 조회
//	List<MemberDTO> list = session.selectList("memberlist");
//	for(MemberDTO dto2 : list) {
//		System.out.println(dto2.getId() + " : " + dto2.getName() + " : " + dto2.getAddress());
//	}
	
	// 1개 레코드만 조회
//	MemberDTO onedto = session.selectOne("member", "mybatis");
//	System.out.println(onedto.getId() + " : " + onedto.getName() + " : " + onedto.getAddress());
	
	// 페이징 처리 조회
//	int[] limit = {5, 6};
//	List<MemberDTO> list = session.selectList("paginglist", limit);
//	for(MemberDTO pagingdto : list) {
//		System.out.println(pagingdto.getId() + " : " + pagingdto.getName() + " : " + pagingdto.getAddress());
//	}
	
//	String address[] = {"서울", "제주"};
//	List<String> list = session.selectList("addresssearch", address);
//	for(String s : list) {
//		System.out.println(s);
//	}
}
