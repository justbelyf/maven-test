package com.lyf.springmvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MyController {
	 @RequestMapping(value="/hello",method=RequestMethod.GET)
	    public String sayHello(Model model) {
		 System.out.println("come in MyController-sayHello method ");
	        model.addAttribute("msg", "Hello, World!");
	        System.out.println("end MyController-sayHello method ");
	        return "hello";
	    }
	
}
