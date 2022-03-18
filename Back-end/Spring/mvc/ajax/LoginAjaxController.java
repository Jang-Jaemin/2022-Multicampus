package ajax;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import spring.mybatis.MemberDTO;
import spring.mybatis.MemberService;

@Controller
public class LoginAjaxController {
	@Autowired
	@Qualifier("mybatisservice")
	MemberService service;
	
	// 로그인 화면 뷰
	@GetMapping("/ajax/login")
	public void loginform() {
	}
		
	// 로그인 ajax 처리 메소드
	@PostMapping(value="/ajax/login", produces= {"application/json;charset=utf-8"})
	@ResponseBody
	public String loginresult(String id, String password) {
		if(id.equals("ajax") && password.equals("1234")) {
			// admin 역할 정상 로그인
			return "{\"process\" : \"정상 로그인\", \"role\" : \"admin\"}";
		} else {
			return "{\"process\" : \"비정상 로그인\", \"role\" : \"user\"}";
		}
	}
	
	@GetMapping(value="ajax/myinform", produces= {"application/json;charset=utf-8"})
	@ResponseBody
	public MemberDTO myinform(String id, String password) {
		MemberDTO dto = service.member(id);
		System.out.println("/ajax/myinfrom 호출 ->" + dto);
		if(dto == null) {
			dto = new MemberDTO();
			dto.setId("new");
		} else if(! dto.getPassword().equals(password)) {
			dto.setPassword("new");
			dto.setName(null);
			dto.setPhone(null);
			dto.setEmail(null);
			dto.setEmail(null);
		}
		
		return dto;	// pom.xml 라이브러리 추가
	}
	
	@GetMapping(value="ajax/memberlist", produces= {"application/json;charset=utf-8"})
	@ResponseBody
	public List<MemberDTO> memberlist() {
		List<MemberDTO> list = service.memberlist();
		
		return list;
		
	}
}
