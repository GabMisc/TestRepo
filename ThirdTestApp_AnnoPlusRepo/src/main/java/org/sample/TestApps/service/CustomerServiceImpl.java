package org.sample.TestApps.service;

import java.util.List;

import org.sample.TestApps.model.Customer;
import org.sample.TestApps.repository.HibernateCustomerRepositoryImpl;
import org.sample.TestApps.repository.ICustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("customerService")
public class CustomerServiceImpl implements ICustomerService {

	@Autowired
	private ICustomerRepository customerRepository;
	
	/* (non-Javadoc)
	 * @see org.sample.TestApps.service.ICustomerService#findAll()
	 */
	@Override
	public List<Customer> findAll(){
		
		return customerRepository.findAll();
		
	}
	
	
}
