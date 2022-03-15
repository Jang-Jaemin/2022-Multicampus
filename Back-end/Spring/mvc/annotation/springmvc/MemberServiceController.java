package annotation.springmvc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import annotation.service.MemberDTO;
import annotation.service.MemberService;

@Controller
public class MemberServiceController {
	@Autowired
	MemberService service;
	
	@RequestMapping("/memberservice")
	public ModelAndView memberservice(MemberDTO dto) {
		ModelAndView mv = new ModelAndView();
		boolean loginresult = service.login(dto);
		String registerresult = service.registerMember(dto);
		mv.addObject("loginresult", loginresult);
		mv.addObject("registerresult", registerresult);
		
		mv.setViewName("memberservice");
		return mv;
	}
}
