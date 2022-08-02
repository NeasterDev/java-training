package com.dogo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


//Notice that in this controller the regular annotation of @Controller is being used. 
//This annotation is correct because in the case of the index method we want 
//this controller to look for a matching view to send as the response.
@Controller
public class HomeController {

	@RequestMapping("/")
	public String index() {
//		Notice the file extension is included. This is required to find the file because 
//		you are not using the Thymeleaf dependency which would automatically search for a 
//		file that contains .html as the suffix.
		return "index.html";
	}
	
	@RequestMapping("/chat")
	public String chat() {
		return "chat.html";
	}
}
