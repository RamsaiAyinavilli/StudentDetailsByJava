package com.student.operations;

import java.util.List;

import com.student.model.Student;

public interface StudentDAO { //DAO-data access objects
 
	public void addStudent(Student student);
	public void displayStudent(Student student);
	List<Student> dispalyStudent();
	List<Student>displayStudent(String studentName);
	List<Student>displayStudent1(String courseName);
	public Student displayStudent(int studentId);
}
