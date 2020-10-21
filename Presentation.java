package basics;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Presentation {

	private ServiceLayer ser;
	
	
@Autowired
	public void setSer(ServiceLayer ser) {
	System.out.println("ser wired with presentation");
		this.ser = ser;
	}



	public void startApplication() {
		// TODO Auto-generated method stub
		System.out.println("input is gathered from the user");
		String whatHappenedInService = ser.callServiceFunction("params");
		System.out.println("update ui based on " + whatHappenedInService);
		
	}

}
