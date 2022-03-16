package mybatis;

import java.io.IOException;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class MemberMain {

	public static void main(String[] args) throws IOException {
		SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
		SqlSessionFactory factory = builder.build(
				Resources.getResourceAsReader("mybatis/mybatis-config.xml")
				);
		SqlSession session = factory.openSession(true);
		
		MemberDAO dao = new MemberDAO();
		dao.setSession(session);
		
		MemberServiceImpl service = new MemberServiceImpl();
		service.setDao(dao);
		
		// 저장
//		MemberDTO dto = new MemberDTO();
//		dto.setId("mybatis2");
//		dto.setPassword("mybatis2");
//		dto.setName("홍길동");
//		dto.setPhone("012-1111-2222");
//		dto.setEmail("mybatis2@a.com");
//		dto.setAddress("인천");
//		int insertrow = service.insertmember(dto);
//		System.out.println(insertrow);
		
		// 수정
//		MemberDTO dto = new MemberDTO();
//		dto.setId("mybatis2");
//		dto.setName("이순신");
//		int updaterow = dto.setAddress("제주");
//		service.updatemember(update);
		
		// 삭제
//		service.deletemember("mybatis2");
		
		// 전체 조회
//		List<MemberDTO> list = session.selectList("memberlist");
//		for(MemberDTO dto2 : list) {
//			System.out.println(dto2.getId() + " : " + dto2.getName() + " : " + dto2.getAddress());
//		}
		
		// 1개 레코드만 조회
//		MemberDTO onedto = session.selectOne("member", "mybatis");
//		System.out.println(onedto.getId() + " : " + onedto.getName() + " : " + onedto.getAddress());
		
		// 페이징 처리 조회
//		int[] limit = {5, 6};
//		List<MemberDTO> list = session.selectList("paginglist", limit);
//		for(MemberDTO pagingdto : list) {
//			System.out.println(pagingdto.getId() + " : " + pagingdto.getName() + " : " + pagingdto.getAddress());
//		}
		
//		String address[] = {"서울","제주"};
//		List<String> list = session.selectList("addresssearch", address);
//		for(String s : list) {
//			System.out.println(s);
//		}
		
	}

}
