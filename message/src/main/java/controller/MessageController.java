package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import model.Message;
import model.Order;
import service.MessageService;

@RestController
@RequestMapping("/messages")
public class MessageController {
	
	@Autowired
	MessageService messageService;

	@PostMapping("/order")
	public Message sendOrderFulfillmentNotification(@RequestBody Order order) {
		return messageService.sendMessage(order);
	}
}
