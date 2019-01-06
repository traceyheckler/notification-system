package service;

import model.Message;
import model.Order;
import model.Preference;

public class MessageServiceImpl implements MessageService {

	@Override
	public Message sendMessage(Order order) {
		Message message = getOrderMessage(order.getOrderId());
		Preference preference = getPreference(order.getStoreId());
		
		message.setSendType(preference.getNotificationType());
		message.setSendAddress(preference.getNotificationAddress());
		
		return message;
	}

	protected Preference getPreference(String storeId) {
		// TODO: change this to call preference service
		Preference preference = new Preference();
		preference.setNotificationType("email");
		preference.setNotificationAddress("tracey.heckler@infor.com");
		return preference;
	}

	protected Message getOrderMessage(String orderId) {
		Message message = new Message();
		
		String messageBody = "Order " + orderId + " has been fulfilled!";
		message.setMessageBody(messageBody);
		
		return message;
	}

}
