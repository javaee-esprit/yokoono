package esprit.ono.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AccessController {

	
	public AccessController() {
	}
	
	@RequestMapping("/")
	public String index(){
		return "/welcome";
	}
}
