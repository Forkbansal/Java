package basics;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;


@ComponentScan()
public class TestAnnotationExample {
	
	@Bean
	public DAOLayer f1()
	{
		System.out.println("dao object created byus, but given to spring for wiring");
		DAOLayer x =new DAOLayer();
		return x;
		
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AnnotationConfigApplicationContext c =
				new AnnotationConfigApplicationContext(TestAnnotationExample.class);
		Presentation x = c.getBean(Presentation.class);
		x.startApplication();
		
		

	}

}
