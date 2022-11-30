package in.ashokit.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyRest 
{
	@Value("${myapp.messages.welcomeMsg}")
	private String messages;
	
	@GetMapping("/welcome")
	public String getWelcomeMsg()
	{
		return messages;
	}

}
