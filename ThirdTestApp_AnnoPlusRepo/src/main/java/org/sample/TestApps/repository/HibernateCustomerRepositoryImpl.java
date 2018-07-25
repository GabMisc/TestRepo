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
		
		customers.add(customer);
		customers.add(customer2);
		customers.add(customer3);
		
		return customers;

	}
}
