package org.student;

import org.department.Department;

public class Student extends Department{
	public void studentName() {
		System.out.println("Student Name : Yogavady");
	}
	
	public void studentDept() {
		System.out.println("Student Department: Computer Science");
	}
	
	public void studentId() {
		System.out.println("Student ID: S1011042");
	}
	
	public static void main(String[] args) {
		System.out.println("Mutilevel Inhertiance");
		Student s = new Student();
		s.collegeName();
		s.collegeCode();
		s.collegeRank();
		s.deptName();
		s.studentName();
		s.studentDept();
		s.studentId();
	}
}
