package br.com.soneca.iptj.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;



@Controller
public class HomeController {
	
	@RequestMapping("/index")
	public ModelAndView index(){
		return new ModelAndView("index");
	}

}
