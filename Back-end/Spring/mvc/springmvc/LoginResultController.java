package springmvc;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

public class LoginResultController implements Controller {

	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
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
