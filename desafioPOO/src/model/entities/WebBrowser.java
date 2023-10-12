package model.entities;

public interface WebBrowser {
	
	void goToWebPage(String adress);
	void refreshPage();
	void previousPage(String adress);
	void nextPage(String adress);
	void newTab();
	void closeTab();
	void closeBrowser();

}
