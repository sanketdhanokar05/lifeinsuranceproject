package com.project.package1.service;

import com.project.package1.entity.Customer;
import com.project.package1.entity.Nominee;

public interface CustomerService {
	
	Nominee addNominee(Nominee nominee);

	Customer updateProfile(Customer customer);

}
