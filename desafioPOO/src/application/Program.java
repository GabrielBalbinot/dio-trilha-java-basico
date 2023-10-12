package application;

import model.entities.Browser;
import model.entities.Iphone;
import model.entities.MusicPlayer;
import model.entities.MusicPlayerInterface;
import model.entities.Phone;
import model.entities.PhoneInterface;
import model.entities.WebBrowser;

public class Program {

	public static void main(String[] args) {
		
		int memoryCapacity = 512;
		
		MusicPlayerInterface musicPlayer = new MusicPlayer();
		PhoneInterface phone = new Phone();
		WebBrowser browser = new Browser("Safari");		
		
		Iphone iphone = new Iphone(memoryCapacity, musicPlayer, phone, browser);	
				
	}

}
