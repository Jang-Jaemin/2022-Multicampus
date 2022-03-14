package annotation.springmvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ReturnTypeController {
	@RequestMapping("/a")
	public ModelAndView a() {
		ModelAndView mv = new ModelAndView();
		mv.addObject("model", "컨트롤러에서 전달하는 모델입니다.");
		mv.setViewName("aa");
		return mv;
	}
	
	@RequestMapping("/b")
	public String b() {
		// 모델 X
		return "bb";
	}
	
	@RequestMapping("/c")
	public void cc() {
		// 모델 X
	}
	
	@RequestMapping("/d")
	public String d() {
		return "aa";	// aa.jsp 호출 - 모델 전달값 X
	}
	
	@RequestMapping("/e")
	public String e() {
		return "redirect:/a";	// a 매핑 메소드 호출 - 모델 - aa.jsp
	}
}
