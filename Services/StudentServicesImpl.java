package com.student.Services;

import java.util.List;
import java.util.Scanner;

import com.student.model.Student;
import com.student.operations.StudentDAO;
import com.student.operations.StudentDAOImpl;


public class StudentServicesImpl implements StudentServices {
Scanner scan =new Scanner(System.in);
StudentDAO dao=new StudentDAOImpl();

;	@Override
	public void addStudent() {
		// TODO Auto-generated method stub
	System.out.println("Enter Student Id : ");
		int sId=scan.nextInt();
		scan.nextLine();
		System.out.println("Enter Student Name : ");
		String sName=scan.nextLine().toUpperCase();
		
		System.out.println("Enter Course Name : ");
		String cName=scan.nextLine().toUpperCase();
		
		System.out.println("Enter Course Fees : ");
		float cFees=scan.nextFloat();
		scan.nextLine();
		Student s= new Student();
		s.setStudentName(sName);
		s.setCourseName(cName);
		s.setCourseFees(cFees);
		s.setStudentId(sId);
		dao.addStudent(s);
	
	}

	@Override
	public void displayStudentById() {
		// TODO Auto-generated method stub
		System.out.println("Enter Student Id : ");
		int sId= scan.nextInt();
		scan.nextLine();
		Student si =dao.displayStudent(sId);
		if(si.getStudentId() == 0) {
			System.out.println("Student not found !");
		}
		else {
			dao.displayStudent(si);
		}
	}
	

	@Override
	public void displayStudentByName() {
		// TODO Auto-generated method stub
		System.out.println("Enter Student Name : ");
		String sName=scan.nextLine().toUpperCase();
	
		List<Student> sn = dao.displayStudent(sName);
		for(Student s :sn ) {
			dao.displayStudent(s);
		}
	}
	public void displayStudentByCourseName() {
		// TODO Auto-generated method stub
		System.out.println("Enter Course Name : ");
		String cName=scan.nextLine().toUpperCase();
		
		List<Student> cn = dao.displayStudent1(cName);
		for(Student s :cn ) {
			dao.displayStudent(s);
		}
	}

	@Override
	public void displayAllStudents() {
		// TODO Auto-generated method stub
		List<Student> sa=dao.dispalyStudent();
		for(Student s:sa) {
			dao.displayStudent(s);
		}
	}

	@Override
	public void menu() {
		// TODO Auto-generated method stub
		while(true) {
			System.out.println("=======================*STUDENT-DETAILS*====================");
			System.out.println("Press 1 for Add New Student");
			System.out.println("Press 2 for Display All Students");
			System.out.println("Press 3 for Display Stuent By ID");
			System.out.println("Press 4 for Display Student By Name");
			System.out.println("Press 5 for Display Student By CourseName");
			System.out.println("Press 0 for Exit");
			System.out.println("Please Enter your choice ");
			int choice = scan.nextInt();
			scan.nextLine();
			switch(choice) {
			case 0 : System.exit(choice);
			case 1 : addStudent();break;
			case 2 : displayAllStudents();break;
			case 3 : displayStudentById();break;
			case 4 : displayStudentByName();break;
			case 5 : displayStudentByCourseName(); break;
			default : System.out.println("Sorry!!!! You have entered a wrong choice...");
			}
		}
	}
	}


