package annotation.springmvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginFormController {

	//@RequestMapping("/loginform")
	public String loginform() throws Exception {
		// /loginform 입력 시 실행
		return "loginform";
	}

}
