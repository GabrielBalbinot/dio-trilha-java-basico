package model.entities;

import java.util.ArrayList;
import java.util.List;

public class Phone implements PhoneInterface {
	
	List<PhoneNumber> contacts = new ArrayList<PhoneNumber>();
	
	public Phone() {
		
	}	

	public List<PhoneNumber> getContacts() {
		return contacts;
	}

	@Override
	public void makeCall(String number) {
		System.out.println("Making a call!");
	}

	@Override
	public void endCall() {
		System.out.println("Ending the call!");
	}

	@Override
	public void answerCall() {
		System.out.println("Answering the call!");
	}

	@Override
	public void receiveMessage() {
		System.out.println("You received a message!");
	}

	@Override
	public void sendMessage(String message) {
		System.out.println("Sending a message!");
	}

	@Override
	public void addPhoneNumber(PhoneNumber phoneNumber) {
		contacts.add(phoneNumber);
	}

	@Override
	public void removePhoneNumber(PhoneNumber phoneNumber) {
		contacts.remove(phoneNumber);
	}

}
