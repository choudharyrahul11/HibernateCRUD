package com.rahul.hibernate.serviceImpl;

import com.rahul.hibernate.DAO.EmployeeDAO;
import com.rahul.hibernate.DAOImpl.EmployeeDAOImpl;
import com.rahul.hibernate.model.Employee;
import com.rahul.hibernate.service.EmployeeService;

public class EmployeeServiceImpl implements EmployeeService {

	EmployeeDAO employeeDAO = new EmployeeDAOImpl();

	public void createEmployee(Employee employee) {
		employeeDAO.createEmployee(employee);
	}

	public void deleteEmployee(int empID) {
//		EmployeeDAO employeeDAO = new EmployeeDAOImpl();
		employeeDAO.deleteEmployee(empID);
		
	}

	public void updateEmployee(int empID, String updatedContactNumber) {
		employeeDAO.updateEmployee(empID, updatedContactNumber);
	}

	public Employee fetchEmployeeDetails(int inputValue) {
		return employeeDAO.fetchEmployeeDetails(inputValue);

	}

}
