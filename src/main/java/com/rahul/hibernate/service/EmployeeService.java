package com.rahul.hibernate.service;

import com.rahul.hibernate.model.Employee;

public interface EmployeeService {

	public void createEmployee(Employee employee);

	public void deleteEmployee(int empID);

	public void updateEmployee(int empID, String updatedContactNumber);

	public Employee fetchEmployeeDetails(int inputValue);

}
