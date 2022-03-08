package com.project.package1.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.package1.entity.Customer;
import com.project.package1.entity.Nominee;
import com.project.package1.repository.CustomerRepository;
import com.project.package1.repository.NomineeRepository;

@Service
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	private NomineeRepository nomineeRepository;

	@Autowired
	private CustomerRepository customerRepository;

	@Override
	public Nominee addNominee(Nominee nominee) {
		Nominee newNominee = nomineeRepository.save(nominee);
		return newNominee;
	}

	@Override
	public Customer updateProfile(Customer customer) {
//		Optional<Customer> c1 = customerRepository.findById(customer.getId());
//
//		if (c1.isEmpty()) {
//			throw new CustomerNotFoundExceptioin("Customer is not available with id" + customer.getId());
//		} else {
//			return customerRepository.getById(customer.getId());
//		}
		Customer newCustomer = customerRepository.save(customer);
		return newCustomer;
	}

}
