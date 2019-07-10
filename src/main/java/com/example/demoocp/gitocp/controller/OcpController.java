<<<<<<< HEAD
package com.example.demoocp.gitocp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/demo")
public class OcpController {
	
	@GetMapping("/welcome")
	public String welcome()
	{
		return "Welcome to openshift";
	}

}
=======
package com.example.demoocp.gitocp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/demo")
public class OcpController {
	
	@GetMapping("/welcome")
	public String welcome()
	{
		return "Welcome to openshift";
	}

}
>>>>>>> 395b43035ccaa7a815dea73eb20835a119b1acf3
