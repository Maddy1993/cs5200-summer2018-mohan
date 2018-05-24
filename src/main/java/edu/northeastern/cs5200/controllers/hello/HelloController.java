package edu.northeastern.cs5200.controllers.hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import edu.northeastern.cs5200.controllers.hello.HelloObject;

@RestController
public class HelloController {
	@RequestMapping("api/hello/string")
	public String sayHello() {
		return "Hello Srinivas Pothukuchi!";
	}
	
	@RequestMapping("api/hello/object")
	public HelloObject returnObject() {
		HelloObject obj = new HelloObject("Hello Mohan Pothukuchi!");
		return obj;
	}
}

