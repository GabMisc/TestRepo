import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.isA;
import static org.hamcrest.CoreMatchers.notNullValue;
import static org.junit.Assert.*;

import java.util.List;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.sample.TestApps.model.Customer;
import org.sample.TestApps.repository.HibernateCustomerRepositoryImpl;
import org.sample.TestApps.repository.ICustomerRepository;

public class HibernateCustomerRepositoryImpTest {

	private static ICustomerRepository customerRepository;
	
	@BeforeClass
	public static void createCustomerRepository() {		
		customerRepository = new HibernateCustomerRepositoryImpl();		
	}
	
	@AfterClass
	public static void cleanCustomerRepositoryObj() {
		customerRepository = null;
	}
	
	@Test
	public void testCustomerRepositoryIsNotNull() {	
		assertThat("CustomerRepository is a fucking null",customerRepository, is(notNullValue()));
		System.out.println("testCustomerRepositoryIsNotNull" + customerRepository);
	}
	
	@Test
	@Ignore
	public void testFindAllMethod_toReturnAValidList() {
		System.out.println("testFindAllMethod_toReturnAValidList" + customerRepository);
		List<Customer> customerList = customerRepository.findAll();
		
		assertThat("CustomerList is null",customerList,is(notNullValue()));
		assertThat("CustomerList size is not of the expected lenght (2)",customerList.size(),is(2));
		assertThat("CustomerList[0] is not of Type CustomerClass",customerList.get(0), isA(Customer.class));
		assertThat("CustomerList[1] is not of Type CustomerClass",customerList.get(1), isA(Customer.class));		
	}

}
