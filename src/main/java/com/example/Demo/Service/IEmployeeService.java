package com.example.Demo.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.Demo.model.EmployeeData;

@Service
public interface IEmployeeService {

	EmployeeData AddEmployee(EmployeeData data);
	EmployeeData FindDetails(Long Id);
	String DeleteId(Long Id);
	List<EmployeeData> GetDetails();
	EmployeeData EditData(EmployeeData data);
}
