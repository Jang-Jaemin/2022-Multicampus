package ajax;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AllAjaxController {
	@RequestMapping("/ajax/a")
	public String a() {
		return "{\"result\":true}";
	}
	
	@RequestMapping("/ajax/b")
	public MemberDTO b() {
		return new MemberDTO("id", "password");
	}
	
	@RequestMapping("/ajax/c")
	public String[] c() {
		return new String[] {"a", "b", "c"};
	}
}
