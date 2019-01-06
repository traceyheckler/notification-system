package service;

import model.Message;
import model.Order;

public interface MessageService {

	Message sendMessage(Order order);
}
