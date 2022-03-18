package springmvc;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

public class ListController implements Controller {

	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
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
