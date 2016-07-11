package edu.mum.waa.amazing.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController {

//	@RequestMapping("/")
//	public String welcome(Model model) {
//		model.addAttribute("greeting", "Welcome to Web Store!");
//		model.addAttribute("tagline", "The one and only amazing web store");
//		
//		return "welcome";
//	}
//	
//	@RequestMapping("/welcome/greeting")
//	public String greeting() {
//		return "welcome";
//	}
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String goToHomePage() {
        return "redirect:/products";
    }

//    @RequestMapping("/products")
//    public String goHome() {
//            return "products";
//    }
}
