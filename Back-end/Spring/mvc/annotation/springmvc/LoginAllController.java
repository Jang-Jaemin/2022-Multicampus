package annotation.springmvc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LoginAllController {
//	//@RequestMapping(value="/login", method=RequestMethod.GET)
//	@GetMapping("/login")
//	public String loginform() throws Exception {
//		// /loginform 입력 시 실행
//		return "loginform";
//	}
//	
//	//@RequestMapping(value="/login", method=RequestMethod.POST)
//	@PostMapping("/login")
//	public ModelAndView loginresult(HttpServletRequest request) throws Exception {
//		ModelAndView mv = new ModelAndView();
//		// id: spring, password: 1234 - "정상 로그인 사용자입니다."
//		if(request.getParameter("id").equals("spring") && request.getParameter("password").equals("1234")) {
//			mv.addObject("loginresult", "정상 로그인 사용자입니다.");
//		} else {
//			mv.addObject("loginresult", "비정상 로그인 사용자입니다.");
//		}
//		mv.setViewName("loginresult");
//		return mv;
//	}
	
//	// test3 매개변수를 자바 변수 타입으로 설정
//	//@RequestMapping(value="/login", method=RequestMethod.GET)
//	@GetMapping("/login")
//	public String loginform() throws Exception {
//		// /loginform 입력 시 실행
//		return "loginform";
//	}
//		
//	//@RequestMapping(value="/login", method=RequestMethod.POST)
//	@PostMapping("/login")
//	public ModelAndView loginresult(@RequestParam("id1") String id, @RequestParam("pw") String password, int age, String[] hobby) {
//		ModelAndView mv = new ModelAndView();
//		// id: spring, password: 1234 - "정상 로그인 사용자입니다."
//		if(id.equals("spring") && password.equals("1234")) {
//			mv.addObject("loginresult", "정상 로그인 사용자입니다.");
//		} else {
//			mv.addObject("loginresult", "비정상 로그인 사용자입니다.");
//		}
//		mv.addObject(age - 1);
//		mv.addObject("hobby", hobby[0]);
//		mv.addObject("hobby", hobby[1]);
//		mv.addObject("hobby", hobby[2]);
//		mv.addObject("age", age - 1);
//		mv.setViewName("loginresult");
//		return mv;
//	}
	
	// test4 매개변수를 자바 객체로 설정
	//@RequestMapping(value="/login", method=RequestMethod.GET)
	@GetMapping("/login")
	public String loginform() throws Exception {
		// /loginform 입력 시 실행
		return "loginform";
	}
			
	//@RequestMapping(value="/login", method=RequestMethod.POST)
	@PostMapping("/login")
	public ModelAndView loginresult(@ModelAttribute("dto") LoginDTO dto) {
		//dto.setId(request.getParameter("id"));
		//dto.setPassword(request.getParameter("password"));
		ModelAndView mv = new ModelAndView();
		// id: spring, password: 1234 - "정상 로그인 사용자입니다."
		if(dto.getId().equals("spring") && dto.getPassword().equals("1234")) {
			mv.addObject("loginresult", "정상 로그인 사용자입니다.");
		} else {
			mv.addObject("loginresult", "비정상 로그인 사용자입니다.");
		}
		mv.setViewName("loginresult");
		return mv;
	}
}
