package com.project.package4.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.package4.entity.Premium;
@Repository
public interface PremiumRepository extends JpaRepository<Premium,Integer> {

}
