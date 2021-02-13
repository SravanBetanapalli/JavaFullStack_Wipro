package com.fsd.wipro.hibernate.orm.dao;

import java.util.List;

import org.hibernate.Hibernate;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.fsd.wipro.hibernate.orm.model.Employee;
import com.fsd.wipro.hibernate.orm.util.HibernateUtil;

public class EmployeeDao {
	
	//save_create employee objs in DB
	
	public void saveEmployeeList(List<Employee> emp) {
		Transaction transaction = null;
		
		try(Session session = HibernateUtil.getSessionFactory().openSession()){
			
			transaction=session.beginTransaction();
			emp.forEach(emp1-> session.save(emp1));
			transaction.commit();
			session.close();
			
		}catch (Exception e) {
			// TODO: handle exception
			if(transaction!=null) {
				transaction.rollback();
			}
		}
		
	}
	
	
	public void saveEmployee(Employee emp) {
		Transaction transaction = null;
		
		try(Session session = HibernateUtil.getSessionFactory().openSession()){
			
			transaction=session.beginTransaction();
			session.save(emp);
			transaction.commit();
			session.close();
		
		}catch (Exception e) {
			// TODO: handle exception
			if(transaction!=null) {
				transaction.rollback();
			}
		}
		
	}

}
