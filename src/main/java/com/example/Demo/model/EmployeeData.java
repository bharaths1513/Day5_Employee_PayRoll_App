package com.example.Demo.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Employee_PayRoll")
public class EmployeeData {

	@Id
	private long empId;
	private String empName;
	private double empSalary;

	public EmployeeData() {
		empId = 0;
		empName = "";
		empSalary = 0.0;

	}

	public EmployeeData(long empId, String empName, double empSalary) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empSalary = empSalary;
	}

	public long getEmpId() {
		return empId;
	}

	public String getEmpName() {
		return empName;
	}

	public double getEmpSalary() {
		return empSalary;
	}

	public void setEmpId(long empId) {
		this.empId = empId;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public void setEmpSalary(double empSalary) {
		this.empSalary = empSalary;
	}

}
