package net.codejava;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("/home")
public class HelloWorldService {
	@GetMapping("/hello")
	public String Hello() {
		
		return "{'id':100,'name':'Linga'}";
	}

}

	
	