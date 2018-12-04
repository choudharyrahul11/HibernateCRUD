package com.rahul.hibernate;

import java.util.Scanner;

import com.rahul.hibernate.model.Address;
import com.rahul.hibernate.model.Employee;
import com.rahul.hibernate.service.EmployeeService;
import com.rahul.hibernate.serviceImpl.EmployeeServiceImpl;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		System.out.println("Hello World!");

		// new EmployeeDAOImpl().createEmployee();

		Employee emp = new Employee();
		emp.setFirstName("Deepak");
		emp.setLastName("Roomie");
		emp.setContactNumber("9051547111");
		
		Address address = new Address();
		address.setCityName("Ranchi");
		address.setStreetName("Ratu Road");
		address.setState("Jharkhand");
		address.setZipCode(834005);
		
		emp.setAddress(address);

		EmployeeService employeeService = new EmployeeServiceImpl();
		employeeService.createEmployee(emp);

		System.out.println("Enter the employee ID for Employee details");
		Scanner sc = new Scanner(System.in);

		int empID = sc.nextInt();
		System.out.println("Provided Employee ID is " + empID);
		Employee employeeDetails = employeeService.fetchEmployeeDetails(empID);
		System.out.println("Employee details for the provided id" + employeeDetails);
		/*System.out.println("Enter the empID and the contact details to be updated:");
		empID = sc.nextInt();
		String updatedContactNumber = sc.nextLine();
		employeeService.updateEmployee(empID, updatedContactNumber);
		System.out.println("Provide the Employee ID of the employee to be deleted:");
		empID = sc.nextInt();
		employeeService.deleteEmployee(empID);*/

		sc.close();

	}
}
