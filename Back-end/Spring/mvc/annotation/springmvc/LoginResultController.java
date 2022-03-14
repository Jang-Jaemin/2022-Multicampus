package annotation.springmvc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LoginResultController {

	//@RequestMapping("/loginresult")
	public ModelAndView loginresult(HttpServletRequest request) throws Exception {
		ModelAndView mv = new ModelAndView();
		// id: spring, password: 1234 - "정상 로그인 사용자입니다."
		if(request.getParameter("id").equals("spring") && request.getParameter("password").equals("1234")) {
			mv.addObject("loginresult", "정상 로그인 사용자입니다.");
		} else {
			mv.addObject("loginresult", "비정상 로그인 사용자입니다.");
		}
		mv.setViewName("loginresult");
		return mv;
	}

}
