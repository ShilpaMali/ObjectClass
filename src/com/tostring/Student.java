package com.tostring;

public class Student {//extends Object

	int studentId;
	String studentFirstName;
	String studentLastName;
	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentFirstName=" + studentFirstName + ", studentLastName="
				+ studentLastName + "]";
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//stud object contain 101 sachin patil
		Student stud = new Student();
		stud.studentId = 101;
		stud.studentFirstName = "sachin";
		stud.studentLastName = "patil";
		System.out.println(stud);

	}

}
