package annotation.springmvc;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ListController {

	@RequestMapping("/list")
	public ModelAndView list() throws Exception {
		// model
		ArrayList<HelloDTO> list = new ArrayList<HelloDTO>();
		
		HelloDTO d1 = new HelloDTO();
		d1.setMessage("리스트1");
		HelloDTO d2 = new HelloDTO();
		d2.setMessage("리스트2");
		HelloDTO d3 = new HelloDTO();
		d3.setMessage("리스트3");
		
		list.add(d1);
		list.add(d2);
		list.add(d3);
		
		ModelAndView mv = new ModelAndView();
		mv.addObject("dtolist", list);
		mv.setViewName("list");

		// view
		return mv;
	}

}
