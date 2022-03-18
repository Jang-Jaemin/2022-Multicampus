package spring.mybatis;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MemberMybatisController {
	@Autowired
	@Qualifier("mybatisservice")
	MemberService service;
	
	// service memberlist 메소드 전체 회원 조회
	@RequestMapping("/membermybatislist")
	public ModelAndView memberlist() {
		ModelAndView mv = new ModelAndView();
		List<MemberDTO> list = service.memberlist();
		mv.addObject("memberlist", list);
		mv.setViewName("mybatis/memberlist");
		return mv;
	}
	
	@RequestMapping("/membermybatispaginglist")
	public ModelAndView memberlist(int page) {
		ModelAndView mv = new ModelAndView();
		List<MemberDTO> list = service.memberlist(page);
		mv.addObject("memberlist", list);
		mv.addObject("name", "페이징 처리 리스트");
		mv.setViewName("mybatis/memberlist");
		return mv;
	}
	
	@RequestMapping("/membermybatissearch")
	public ModelAndView memberlist(String[] address) {
		ModelAndView mv = new ModelAndView();
		List<String> list = service.memberlist(address);
		mv.addObject("memberaddresslist", list);
		mv.addObject("name", "주소 검색 리스트");
		mv.setViewName("mybatis/memberlist");
		return mv;
	}
	
	@GetMapping("/membermybatisinsert")
	public String insertform() {
		return "mybatis/insertform";
	}
	
	@PostMapping("/membermybatisinsert")
	public ModelAndView insertresult(MemberDTO dto) {
		int result = service.insertmember(dto);
		ModelAndView mv = new ModelAndView();
		mv.addObject("result", result);
		mv.setViewName("mybatis/insertresult");
		return mv;
	}
	
	@GetMapping("/membermybatisupdate")
	public String updateform(String id) {
		return "mybatis/updateform";
	}
	
	@PostMapping("/membermybatisupdate")
	public ModelAndView updateresult(MemberDTO dto) {
		int result = service.updatemember(dto);
		ModelAndView mv = new ModelAndView();
		mv.addObject("result", result);
		mv.setViewName("mybatis/updateresult");
		return mv;
	}
	
	@RequestMapping("/membermybatisdelete")
	public String deleteresult(String id) {
		int result = service.deletemember(id);
		if(result == 1) {
			return "redirect:/membermybatislist";			
		}
		return "redirect:/membermybatisinsert";
	}
}
