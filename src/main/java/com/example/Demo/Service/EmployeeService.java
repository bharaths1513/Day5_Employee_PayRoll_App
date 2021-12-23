package com.example.Demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Demo.Repository.EmployeePayRollRepository;
import com.example.Demo.model.EmployeeData;

@Service
public class EmployeeService implements IEmployeeService {

	@Autowired
	private EmployeePayRollRepository empRepository;

	@Override
	public EmployeeData AddEmployee(EmployeeData data) {
		return empRepository.save(data);
	}

	@Override
	public EmployeeData FindDetails(Long Id) {
		return empRepository.findById(Id).get();
	}

	@Override
	public String DeleteId(Long Id) {
		empRepository.deleteById(Id);
		return "Message got Deleted...!";
		
	}

	@Override
	public List<EmployeeData> GetDetails() {
		return empRepository.findAll();
	}

	@Override
	public EmployeeData EditData(EmployeeData data) {
		EmployeeData Existingdata = empRepository.findById(data.getEmpId()).orElse(null);
		Existingdata.setEmpId(data.getEmpId());
		Existingdata.setEmpName(data.getEmpName());
		Existingdata.setEmpSalary(data.getEmpSalary());
		return empRepository.save(Existingdata);
	}
	
	
	

	
	
}
