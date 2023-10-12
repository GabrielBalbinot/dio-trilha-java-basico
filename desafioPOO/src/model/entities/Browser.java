package model.entities;

public class Browser implements WebBrowser {
	
	private String name;
	
	public Browser(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public void goToWebPage(String adress) {
		System.out.println("Going to the web adress!");		
	}

	@Override
	public void refreshPage() {
		System.out.println("refreshing the page!");		
	}

	@Override
	public void previousPage(String adress) {
		System.out.println("Going to previous web adress!");		
	}

	@Override
	public void nextPage(String adress) {
		System.out.println("Going to next web adress!");
		
	}

	@Override
	public void newTab() {
		System.out.println("Opening new tab!");		
	}

	@Override
	public void closeTab() {
		System.out.println("Closing tab!");		
	}

	@Override
	public void closeBrowser() {
		System.out.println("Closing browser!");		
	}

}
