package org.sample.TestApps.service;

import java.util.List;

import org.sample.TestApps.model.Customer;

public interface ICustomerService {

	List<Customer> findAll();

}