package model.entities;

import java.util.ArrayList;
import java.util.List;

public interface PhoneInterface {
	
	List<PhoneNumber> contacts = new ArrayList<PhoneNumber>();
	
	void makeCall(String number);
	void endCall();
	void answerCall();
	void receiveMessage();
	void sendMessage(String message);
	void addPhoneNumber(PhoneNumber phoneNumber);
	void removePhoneNumber(PhoneNumber phoneNumber);
}
