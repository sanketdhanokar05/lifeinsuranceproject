package com.project.package1.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.package1.entity.Nominee;

public interface NomineeRepository extends JpaRepository<Nominee,Integer>{

}
