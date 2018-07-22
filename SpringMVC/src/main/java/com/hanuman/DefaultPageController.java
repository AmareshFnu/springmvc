package com.hanuman;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DefaultPageController {

	@RequestMapping("/")
	public String defaultPage() {
		return "index";
	}

}
