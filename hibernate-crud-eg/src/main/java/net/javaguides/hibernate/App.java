package net.javaguides.hibernate;

import java.util.List;

import net.javaguides.hibernate.dao.StudentDao;
import net.javaguides.hibernate.dao.iStudentDao;
import net.javaguides.hibernate.model.Student;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		iStudentDao studentDao = new StudentDao();
		Student student = new Student("Ramesh","Fadatare","raj@gmail.com");
		studentDao.saveStudent(student);
		
		student.setFirstName("Ram");
		studentDao.updateStudent(student);
		
		//testing getStudentById
		Student student2=studentDao.getStudentById(student.getId());
		
		//testing getAllStudents
		List<Student> students = studentDao.getAllStudents();
		
		students.forEach(student1-> System.out.println(student1.getId()));

		//test deleteStudent
	//	studentDao.deleteStudent(student.getId());
		
		
	}

}
