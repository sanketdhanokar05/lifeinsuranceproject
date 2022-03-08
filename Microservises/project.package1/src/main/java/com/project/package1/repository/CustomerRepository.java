package com.project.package1.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.package1.entity.Customer;

public interface CustomerRepository extends JpaRepository<Customer,Integer>{

}
