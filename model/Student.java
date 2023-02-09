package com.student.model;

public class Student {
	//private for security
private int studentId;
private String studentName,courseName;
private float courseFees; 
//get and set methods to all variables for add values invidually &call 
//&also to access private variables
public  int getStudentId() {
	return studentId;
}
public void setStudentId(int studentId) {
	this.studentId = studentId;
}
public String getStudentName() {
	return studentName;
}
public void setStudentName(String studentName) {
	this.studentName = studentName;
}
public String getCourseName() {
	return courseName;
}
public void setCourseName(String courseName) {
	this.courseName = courseName;
}
public float getCourseFees() {
	return courseFees;
}
public void setCourseFees(float courseFees) {
	this.courseFees = courseFees;
}

@Override
public String toString(){ // to convert values into string otherwise it shows hashcode([@165tshy)
	return "Student [studentId=" + studentId + ", studentName=" + studentName + ", courseName=" + courseName
			+ ", courseFees=" + courseFees + "]";
}


}
