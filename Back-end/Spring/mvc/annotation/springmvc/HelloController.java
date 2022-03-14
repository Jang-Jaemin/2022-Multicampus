package annotation.springmvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {

	@RequestMapping("/hello")
	public ModelAndView hello() throws Exception {
		// model wjddml + view 선택
		HelloDTO dto = new HelloDTO();
		dto.setMessage("hello mvc, 응답 완료");
		ModelAndView mv = new ModelAndView();
		mv.addObject("model", dto);
		mv.setViewName("hello");
		return mv;
	}

}
