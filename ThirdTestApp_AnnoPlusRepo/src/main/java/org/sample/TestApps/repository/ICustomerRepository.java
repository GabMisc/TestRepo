package org.sample.TestApps.repository;

import java.util.List;

import org.sample.TestApps.model.Customer;

public interface ICustomerRepository {

	List<Customer> findAll();

}