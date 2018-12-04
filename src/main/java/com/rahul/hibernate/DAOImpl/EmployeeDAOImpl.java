package com.rahul.hibernate.DAOImpl;

import org.hibernate.Session;

import com.rahul.hibernate.DAO.EmployeeDAO;
import com.rahul.hibernate.model.Employee;
import com.rahul.hibernate.util.HibernateSessionFactoryUtil;

public class EmployeeDAOImpl implements EmployeeDAO {

	public void createEmployee(Employee employee) {

		Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
		session.beginTransaction();
		session.save(employee);
		session.getTransaction().commit();
		System.out.println("Employee Created");

	}

	public void deleteEmployee(int empID) {
		Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
		Employee emp = (Employee) session.get(Employee.class, empID);
		if (emp != null) {
			session.beginTransaction();
			session.delete(emp);
			session.getTransaction().commit();
			System.out.println("Employee deleted");
		}
	}

	public void updateEmployee(int empID, String updatedContactNumber) {
		Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
		Employee emp = (Employee) session.get(Employee.class, empID);
		if (emp != null) {
			emp.setContactNumber(updatedContactNumber);
			session.beginTransaction();
			session.update(emp);
			session.getTransaction().commit();
			System.out.println("Employee updated");
		}
	}

	public Employee fetchEmployeeDetails(int inputValue) {
		Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
		Employee emp = (Employee) session.get(Employee.class, inputValue);
		System.out.println("To check the lazy and eager loading");
		return emp;

	}
	
//git init
	//git remote add origin "repository link"
}
