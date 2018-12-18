package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import model.MessageRequest;
import service.MessageService;

@RestController
public class MessageController {
	
	@Autowired
	MessageService messageService;

	@PostMapping("/message")
	public void sendMessage(@RequestBody MessageRequest message) {
		messageService.sendMessage();
	}
}
