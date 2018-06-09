package com.springboot;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@CrossOrigin
public class WelcomeController {



	@RequestMapping("/welcome")
	public String dynamicConfiguration() {
		System.out.println("This is welcome screen");
		return "This is welcome screen";
	}
}
