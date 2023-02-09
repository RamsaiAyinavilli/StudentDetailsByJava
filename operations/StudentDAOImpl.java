package com.student.operations;

import java.util.ArrayList;
import java.util.List;

import com.student.model.Student;

public class StudentDAOImpl implements StudentDAO {
	//
 List<Student> stu=new ArrayList <Student>();
	@Override
	public void addStudent(Student student) {
		// added student variable to the obj
		stu.add(student);// we pass value in services
		System.out.println("Student added sucessfully");
		
	}

	@Override
	public void displayStudent(Student student) {
		// TODO Auto-generated method stub
		int flag=0; //initial with 0
		Student s=null;
		for(Student st :stu ) {
			if(st.getStudentId()==student.getStudentId()) {
				flag++;
				s =st;
				break;
			}
		}
		if(flag==0)
		{System.out.println("Student not found");
		}
		else {System.out.println(s);}
	}

	@Override
	public List<Student> dispalyStudent() {
		// TODO Auto-generated method stub
		return stu;
	}

	@Override
	public List<Student> displayStudent(String studentName) {
		List<Student>stun=new ArrayList<Student>();
		for(Student stn:stu) {
			if(stn.getStudentName().equals(studentName)) {
				stun.add(stn);
				
			}
		}
		return stun;
	}

	@Override
	public List<Student> displayStudent1(String courseName) {
		
			List<Student>cou=new ArrayList<Student>();
			for(Student cn:stu) {
				if(cn.getCourseName().equals(courseName)) {
					cou.add(cn);
					
				}
			}
		return cou;
	}

	@Override
	public Student displayStudent(int studentId) {
		// TODO Auto-generated method stub
		int flag=0;
		Student s=new Student();
		s.setStudentId(0);
		for(Student sti:stu) {
		if(sti.getStudentId()==(studentId)) {
			flag++;
			s=sti;
			break;
		}
		}
		
		return s;
	}
}


