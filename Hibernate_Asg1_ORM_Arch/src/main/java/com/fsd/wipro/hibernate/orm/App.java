package com.fsd.wipro.hibernate.orm;

import java.util.ArrayList;
import java.util.List;

import com.fsd.wipro.hibernate.orm.dao.EmployeeDao;
import com.fsd.wipro.hibernate.orm.model.Employee;
import com.fsd.wipro.hibernate.orm.util.HibernateUtil;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		/*
		 * EmployeeDao empDao = new EmployeeDao(); Employee emp = new
		 * Employee("Rajesh",384545,"software Engg",30f); empDao.saveEmployee(emp);
		 */
		 
		
		EmployeeDao empDao2 = new EmployeeDao();
		  List<Employee> empList = new ArrayList<Employee>(); empList.add(new
		  Employee("Rajesh","software Engg",30f)); empList.add(new
		  Employee("Ramesh","Snr software Engg",40f)); empList.add(new
		  Employee("Vijay","Manager",50f)); empList.add(new
		  Employee("Vimal","Snr Manager",60f)); empList.add(new
		  Employee("Lokesh","VP",70f));
		  empDao2.saveEmployeeList(empList);
		
		 
		
		
		
		
		
		
		
		

	}

}
