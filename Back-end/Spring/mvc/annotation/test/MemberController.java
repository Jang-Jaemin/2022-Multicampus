package annotation.test;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MemberController {
	@RequestMapping(value="/memberinsert", method=RequestMethod.GET)
	public ModelAndView insertform() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("test/memberinsert");
		return mv;
	}
	
	//@RequestMapping(value="/memberinsert", method=RequestMethod.POST)
	public ModelAndView insertresult(HttpServletRequest request) throws Exception {
		request.setCharacterEncoding("utf-8");
		String id = request.getParameter("id");
		String password = request.getParameter("password");
		String name = request.getParameter("name");
		String phone = request.getParameter("phone");
		String email = request.getParameter("email");
		String address = request.getParameter("address");
		
		MemberDTO dto = new MemberDTO();
		dto.setId(id);
		dto.setPassword(password);
		dto.setName(name);
		dto.setPhone(phone);
		dto.setEmail(email);
		dto.setAddress(address);
		
		ModelAndView mv = new ModelAndView();
		mv.addObject("dto", dto);
		mv.setViewName("test/member");
		return mv;
	}
	
	//@RequestMapping(value="/memberinsert", method=RequestMethod.POST)
	public ModelAndView insertresult(String id, String password, String name, String phone, String email, String address) {
		MemberDTO dto = new MemberDTO();
		dto.setId(id);
		dto.setPassword(password);
		dto.setName(name);
		dto.setPhone(phone);
		dto.setEmail(email);
		dto.setAddress(address);
		
		ModelAndView mv = new ModelAndView();
		mv.addObject("dto", dto);
		mv.setViewName("test/member");
		return mv;
	}
	
	@RequestMapping(value="/memberinsert", method=RequestMethod.POST)
	public ModelAndView insertresult(@ModelAttribute("dto") MemberDTO dto) {
		ModelAndView mv = new ModelAndView();
		//mv.addObject("dto", dto);
		mv.setViewName("test/member");
		return mv;
	}
}
