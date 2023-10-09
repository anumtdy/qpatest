package com.example.demo;



import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



import java.security.Principal;

@RestController
@RequestMapping("/api/v1")
public class QpaController {
	
	@GetMapping(value="/test")
	public String pushAllComponent(){
		return "Test";
	}


}
