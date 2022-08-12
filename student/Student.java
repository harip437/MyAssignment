package org.student;

import org.department.Department;

public class Student extends Department {
public void studentName()
{
	System.out.println("hari");
}
	public void studentDept()
	{
		System.out.println("csc");
	}
	public void studentid()
	{
		System.out.println("2020117");
}
	public static void main(String[] args) {
		Student obj=new Student();
		obj.collegeName();
		obj.collegeCode();
		obj.collegeRank();
		obj.deptName();
		obj.studentName();
		obj.studentDept();
		obj.studentid();
		
	}
}
