package com.dogo.chat;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class MessageController {

//	 When you need to access methods from a different class 
//	 @Autowired will take care of finding and implementing the 
//	 correct classes based on the name of the property or method. 
//	 In this case, you need access to an instance of the DAO to query the database.
	
	@Autowired
	MessageRepository dao;
	
	// get route to return all messages
	@GetMapping("/chat")
	public List<Message> getMessages(Model model) {
		List<Message> foundMessages = dao.findAll();
		model.addAttribute(foundMessages);
		return foundMessages;
	}
	
	// get router for specific message based on id
	@GetMapping("/chat/{id}")
	public ResponseEntity<Message> getMessage(@PathVariable(value="id") Integer id) {
		Message foundMessage = dao.findById(id).orElse(null);
		
		if (foundMessage == null) {
			return ResponseEntity.notFound().header("Message", "Nothing found with that id").build();
		}
		
		return ResponseEntity.ok(foundMessage);
	}
	
	@GetMapping("/math/add/{x}/{y}")
	public int getMath(@PathVariable("x") int x, @PathVariable("y") int y) {
		return x + y;
	}
	
	// post router to add new messages to the database
	@PostMapping("/chat")
	public ResponseEntity<Message> postMessage(@RequestBody Message message) {
		// Saving to DB using an instance of the repo interface
		Message createdMessage = dao.save(message);
		// RespEntity crafts response to include correct status codes
		return ResponseEntity.ok(createdMessage);
	}
	
	// put router to update a message based on id, and takes values from the body
	@PutMapping("/chat/{id}")
	public ResponseEntity<Message> updateMessage(@PathVariable(value="id") Integer id, @RequestBody Message message) {
		
		Message foundMessage = dao.findById(id).orElse(null);
		
		if (foundMessage == null) {
			return ResponseEntity.notFound().header("Message", "Nothing found with that id").build();
		} else {
			foundMessage.setName(message.getName());
			foundMessage.setContent(message.getContent());
			Message updatedMessage = dao.save(foundMessage);
			return ResponseEntity.ok(updatedMessage);
		}
		

	}
	
	// delete router to delete a message based on id
	@DeleteMapping("/chat/{id}")
	public ResponseEntity<Message> deleteMessage(@PathVariable(value="id") Integer id) {
		
		Message foundMessage = dao.findById(id).orElse(null);
		
		if (foundMessage == null) {
			return ResponseEntity.notFound().header("Message", "Nothing found with that id").build();
		} else {
			dao.delete(foundMessage);
		}
		return ResponseEntity.ok().build();
	}
}
