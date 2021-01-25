package net.javaguides.hibernate.dao;

import java.util.List;

import net.javaguides.hibernate.model.Student;

public interface iStudentDao {

	void saveStudent(Student student);

	Student getStudentById(long id);

	void updateStudent(Student student);

	List<Student> getAllStudents();

	Student deleteStudent(long id);

}