package com.stacksimplify.restservices.Hello;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

//RestController
@RestController
public class HelloWorldController
{
	//Simple Method
	//URI-/helloworld
	//GET
	//@RequestMapping(method=RequestMethod.GET, path ="/helloworld")
	//Request method of GET no need to use below case.
	@GetMapping("/helloworld")
	public String helloWorld()
	{
		return "Hello World1";
		
	}
	@GetMapping("/helloworld-bean")
	public UserDetails helloWorldBean() 
	{
		return new UserDetails ("Raghavendra", "Jamili","Bangalore");
		
	}
	
}