package org.student;

import org.department.Department;

public class student extends Department{

	public void studentName() {
		System.out.println("vikki");
	}
	public void studentDept() {
		System.out.println("BCA dept");
	}
	public void studentID() {
		System.out.println("20757");
	}

	public static void main(String[] args) {
		student std=new student();
		std.collegeName();
		std.collegeCode();
		std.collegeRank();
		std.deptName();
		std.studentName();
		std.studentDept();
		std.studentID();

	}
}

