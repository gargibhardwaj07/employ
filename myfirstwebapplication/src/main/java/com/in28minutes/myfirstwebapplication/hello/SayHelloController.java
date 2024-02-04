package com.in28minutes.myfirstwebapplication.hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SayHelloController {
	@RequestMapping("say-Hello")
	@ResponseBody
	
	public  String SayHello () {
		return "Hello World, I am Gargi a final year btech cse student";
	}
	
	@RequestMapping("say-Hello-jsp")
	//@ResponseBody
	
	public  String SayHelloJsp () {
		return "sayHello";
	}
    
}
