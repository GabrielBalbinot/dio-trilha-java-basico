package model.entities;

public class Iphone {
	
	private Integer memoryCapacity;
	private MusicPlayerInterface musicPlayer;
	private PhoneInterface phone;
	private WebBrowser browser;
	
	public Iphone(Integer memoryCapacity, MusicPlayerInterface musicPlayer, PhoneInterface phone, WebBrowser browser) {
		this.memoryCapacity = memoryCapacity;
		this.musicPlayer = musicPlayer;
		this.phone = phone;
		this.browser = browser;
	}

	public Integer getMemoryCapacity() {
		return memoryCapacity;
	}

	public void setMemoryCapacity(Integer memoryCapacity) {
		this.memoryCapacity = memoryCapacity;
	}

	public MusicPlayerInterface getMusicPlayer() {
		return musicPlayer;
	}

	public void setMusicPlayer(MusicPlayerInterface musicPlayer) {
		this.musicPlayer = musicPlayer;
	}

	public PhoneInterface getPhone() {
		return phone;
	}

	public void setPhone(PhoneInterface phone) {
		this.phone = phone;
	}

	public WebBrowser getBrowser() {
		return browser;
	}

	public void setBrowser(WebBrowser browser) {
		this.browser = browser;
	}

}