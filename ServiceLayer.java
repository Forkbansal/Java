package basics;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ServiceLayer {

	private DAOLayer  d;
	
	
	@Autowired
	public void setD(DAOLayer d) {
		System.out.println("dao wired with service");
		this.d = d;
	}



	public String callServiceFunction(String inputFromPresntation) {
		// TODO Auto-generated method stub
		System.out.println("service got input from presentation");
		String whatHappendINService ="abc";
		d.daoLayerFunction(inputFromPresntation);
		System.out.println("service after dao call telling presentation what happened");
		return whatHappendINService;
	}

}
