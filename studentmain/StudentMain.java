package com.student.studentmain;

import com.student.Services.StudentServices;
import com.student.Services.StudentServicesImpl;

public class StudentMain {
public static void main(String[] args) {
	StudentServices serv=new StudentServicesImpl();
	serv.menu();
}
}
