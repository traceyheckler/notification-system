package model;

public class Message {

	private String sendType;
	private String sendAddress;
	private String messageBody;
	
	public String getSendType() {
		return sendType;
	}
	public void setSendType(String sendType) {
		this.sendType = sendType;
	}
	public String getSendAddress() {
		return sendAddress;
	}
	public void setSendAddress(String sendAddress) {
		this.sendAddress = sendAddress;
	}
	public String getMessageBody() {
		return messageBody;
	}
	public void setMessageBody(String messageBody) {
		this.messageBody = messageBody;
	}

}
