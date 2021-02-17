package com.fsd.hibernate;

import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.fsd.hibernate.entity.Student;
import com.fsd.hibernate.util.HibernateUtil;

public class App {
    public static void main(String[] args) {
    	
    	//using apache commons jar
    	String sentence = "I am  working as Java Developer.";
        String jobProf1 = StringUtils.substringBetween(sentence, "as", ".");
    	System.out.println("printing jobProf1 :"+jobProf1);
    	
        Student student = new Student("Ramesh", "Fadatare", "rameshfadatare@javaguides.com",jobProf1);
        Student student1 = new Student("John", "Cena", "john@javaguides.com","ML Data Engineer");
        Transaction transaction = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            // start a transaction
            transaction = session.beginTransaction();
            // save the student objects
            session.save(student);
            session.save(student1);
            // commit transaction
            transaction.commit();
            session.close();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }

        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            List < Student > students = session.createQuery("from Student", Student.class).list();
            students.forEach(s -> System.out.println(s.getFirstName()));
            session.close();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
       
    }
}