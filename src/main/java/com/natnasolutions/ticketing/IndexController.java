package com.natnasolutions.ticketing;

import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.natnasolutions.ticketing.models.User;

@Controller
public class IndexController {

	// inject via application.properties
	@Value("${index.message:test}")
	private String message = "Hello World";

	@GetMapping("/")
	public String index(Map<String, Object> model) {
		model.put("message", this.message);
		return "index";
	}
	
	@RequestMapping("/user")
	@ResponseBody
	public User getuser() {
		User user = new User();
		user.setAddress("Dallas");
		user.setName("Abadi");
		
		
		return user;
	}

}