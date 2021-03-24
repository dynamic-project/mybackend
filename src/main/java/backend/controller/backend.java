package backend.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path="/", produces="application/json")
@CrossOrigin(origins="*")  
public class backend {
	
	@GetMapping
	public String backEndApp() {
		return "Welcome to My Back End API";
	}

}
