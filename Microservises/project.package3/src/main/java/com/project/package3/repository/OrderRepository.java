package com.project.package3.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.package3.entity.Order;

@Repository
public interface OrderRepository extends JpaRepository<Order,Integer>{

}
