package com.hanuman;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class LoginPageController {

	@RequestMapping("/login")
	public String loginPage() {
		return "login";
	}

}
