package subsistema2.zipcode;

public class ZipcodeAPI {
	
	private static ZipcodeAPI instance = new ZipcodeAPI();
	
	private ZipcodeAPI() {
		
	}
	
	public static ZipcodeAPI getInstance() {
		return instance;
	}
	
	public String getCity(String zipcode) {
		return "City";
	}
	
	public String getState(String zipcode) {
		return "State";
	}

}
