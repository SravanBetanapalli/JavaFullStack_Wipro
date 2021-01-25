package net.javaguides.hibernate.dao;


import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import net.javaguides.hibernate.model.Student;
import net.javaguides.hibernate.util.HibernateUtil;

public class StudentDao implements iStudentDao {

	//Save Student
	//get All students
	//get Student by Id
	//Update Student
	//Delete Student
	
	
	/* (non-Javadoc)
	 * @see net.javaguides.hibernate.dao.iStudentDao#saveStudent(net.javaguides.hibernate.model.Student)
	 */
	@Override
	public void saveStudent(Student student) {
		Transaction transaction =null;
		try(Session session=HibernateUtil.getSessionFactory().openSession()){
			//start the transaction
			transaction = session.beginTransaction();
			
			//save student object
			session.save(student);
			
			//commit the transaction
			transaction.commit();		
		}catch(Exception e) {
			if(transaction!=null) {
				transaction.rollback();
			}
		}
	}
	
	
	
	
	/* (non-Javadoc)
	 * @see net.javaguides.hibernate.dao.iStudentDao#getStudentById(long)
	 */
	@Override
	public Student getStudentById(long id) {
		Transaction transaction =null;
		Student student =null;
		try(Session session=HibernateUtil.getSessionFactory().openSession()){
			//start the transaction
			transaction = session.beginTransaction();
			
			
			//get student objectfrom DB
			//student = session.get(Student.class, id);
			student = session.load(Student.class, id);
			
			//commit the transaction
			transaction.commit();		
		}catch(Exception e) {
			if(transaction!=null) {
				transaction.rollback();
			}
		}
		return student;
	}
	
	

	/* (non-Javadoc)
	 * @see net.javaguides.hibernate.dao.iStudentDao#updateStudent(net.javaguides.hibernate.model.Student)
	 */
	@Override
	public void updateStudent(Student student) {
		Transaction transaction =null;
		try(Session session=HibernateUtil.getSessionFactory().openSession()){
			//start the transaction
			transaction = session.beginTransaction();
			
			//save student object
			session.saveOrUpdate(student);
			
			//commit the transaction
			transaction.commit();		
		}catch(Exception e) {
			if(transaction!=null) {
				transaction.rollback();
			}
		}
	}
	
	
	/* (non-Javadoc)
	 * @see net.javaguides.hibernate.dao.iStudentDao#getAllStudents()
	 */
	@Override
	@SuppressWarnings("unchecked")
	public List<Student> getAllStudents() {
		Transaction transaction =null;
		List<Student> students =null;
		try(Session session=HibernateUtil.getSessionFactory().openSession()){
			//start the transaction
			transaction = session.beginTransaction();
			
			
			//get students
		students= session.createQuery("from Student").list();
			
			//commit the transaction
			transaction.commit();		
		}catch(Exception e) {
			if(transaction!=null) {
				transaction.rollback();
			}
		}
		return students;
	}
	
	
	/* (non-Javadoc)
	 * @see net.javaguides.hibernate.dao.iStudentDao#deleteStudent(long)
	 */
	@Override
	public Student deleteStudent(long id) {
		Transaction transaction =null;
		Student student =null;
		try(Session session=HibernateUtil.getSessionFactory().openSession()){
			//start the transaction
			transaction = session.beginTransaction();
			
			
			//get students
		student= session.get(Student.class, id);
		session.delete(student);
			
			//commit the transaction
			transaction.commit();		
		}catch(Exception e) {
			if(transaction!=null) {
				transaction.rollback();
			}
		}
		return student;
	}
	
	
	
	
	
}
