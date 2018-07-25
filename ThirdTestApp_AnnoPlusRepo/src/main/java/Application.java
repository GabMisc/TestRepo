import org.sample.TestApps.model.Customer;
import org.sample.TestApps.service.ICustomerService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {

	public static void main(String[] args) {
		
		ApplicationContext appContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		ICustomerService customerService = appContext.getBean("customerService",ICustomerService.class);

		for(Customer customer:customerService.findAll()){
			
			System.out.println("Hello " + customer.getFirstName() + " " + customer.getLastName() + "!!!");
			
		}
		
	}

}