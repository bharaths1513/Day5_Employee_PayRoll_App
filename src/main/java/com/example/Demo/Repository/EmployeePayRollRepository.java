package com.example.Demo.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Demo.model.EmployeeData;

@Repository
public interface EmployeePayRollRepository extends JpaRepository<EmployeeData, Long> {

	

	

}
