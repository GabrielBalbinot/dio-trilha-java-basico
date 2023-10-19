package dio.gof.facade;

import subsistema1.crm.CrmService;
import subsistema2.zipcode.ZipcodeAPI;

public class Facade {
	
	public void migrateClient(String name, String zipcode) {
		String city = ZipcodeAPI.getInstance().getCity(zipcode);
		String state = ZipcodeAPI.getInstance().getState(zipcode);
		
		CrmService.saveClient(name, zipcode, city, state);
		
	}

}
