package ajax;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PathVariableController {
	@RequestMapping("/get/{id}")
	public ModelAndView getMember(@PathVariable("id") String id) {
		System.out.println(id);
		ModelAndView mv = new ModelAndView();
		mv.addObject("id", id);
		mv.setViewName(id);
		
		return mv;
	}
}
