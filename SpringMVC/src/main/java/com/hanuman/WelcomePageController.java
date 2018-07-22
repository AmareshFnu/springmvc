package com.hanuman;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class WelcomePageController {

	@RequestMapping(value = "/welcome", method = RequestMethod.POST)
	@ResponseBody
	public String welcomePage(@RequestParam String name, @RequestParam String password) {

		ModelAndView mv = new ModelAndView();
		mv.addObject("name", name);
		mv.addObject("password", password);
		mv.setViewName("welcome");
		return mv.getViewName() + mv.getModelMap().get("name") + mv.getModelMap().get("password");
	}

}
