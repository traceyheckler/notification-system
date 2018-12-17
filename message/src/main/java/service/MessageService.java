package service;

import model.Preference;

public interface MessageService {

	void hearMessage();
	
	Preference getPreference(String storeId);
	
	void sendMessage();
}
