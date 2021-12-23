package com.example.Demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Demo.Service.EmployeeService;
import com.example.Demo.model.EmployeeData;


@RestController
@RequestMapping("/employee")
public class EmployeePayRollController {

	@Autowired
	private EmployeeService service;
	
	@PostMapping("/Add")
	public EmployeeData AddEmployee(@RequestBody EmployeeData data) {
		return this.service.AddEmployee(data);
	}
	
	@GetMapping("/Get/{Id}")
	public EmployeeData GetEmployee(@PathVariable String Id) {
		return this.service.FindDetails(Long.parseLong(Id));
	}
	
	@DeleteMapping("/delete/{Id}")
	public String DeleteEmp(@PathVariable long Id) {
		return this.service.DeleteId(Id);
	}
	
	
	@GetMapping("/ListAll")
	public List<EmployeeData>GetDetails(){
		return this.service.GetDetails();
	}

	@PutMapping("/Update")
	public EmployeeData UpdateData(@RequestBody EmployeeData data) {
		return service.EditData(data);
	}

}
