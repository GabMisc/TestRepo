package org.sample.TestApps.repository;

import java.util.ArrayList;
import java.util.List;

import org.sample.TestApps.model.Customer;
import org.springframework.stereotype.Repository;

@Repository("customerRepository")
public class HibernateCustomerRepositoryImpl implements ICustomerRepository {

	/* (non-Javadoc)
	 * @see org.sample.TestApps.repository.ICustomerRepository#findAll()
	 */
	@Override
	public List<Customer> findAll() {

		List<Customer> customers = new ArrayList();
		
		Customer customer = new Customer();
		customer.setFirstName("Gabriele");
		customer.setLastName("Miscioscia");
		
		Customer customer2 = new Customer();
		customer2.setFirstName("Pippo");
		customer2.setLastName("Le Pippe");
		
		Customer customer3 = new Customer();
		customer3.setFirstName("Gino");
		customer3.setLastName("Ginestra");
		
		//Adding a fourth customer to see a change
		Customer customer4 = new Customer();
		customer4.setFirstName("Peppino");
		customer4.setLastName("Di Caprio");
		
		customers.add(customer);
		customers.add(customer2);
		customers.add(customer3);
		customers.add(customer4);
		
		return customers;

	}
}
