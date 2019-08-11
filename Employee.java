package MyExcersize;

import java.util.Scanner;

public class Employee {
	
//	public Employee(Employee abcd) {
//	   this.name = abcd.name;
//	   this.id = abcd.id;
//	   this.sal = abcd.sal;
//		    
//	  }

	String name;
	String id;
	float sal;
	
//	public Employee(Employee employee) {
//		// TODO Auto-generated constructor stub
//	}

	void inputdata() {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Name of Employee");
		System.out.println();
		name = scan.next();
		System.out.println("Enter EMP ID of Employee");
		System.out.println();
		id = scan.next();
		System.out.println("Enter Salary of Employee");
		System.out.println();
		sal = scan.nextFloat();
		System.out.println();
		
		
	}
	
	void printdata() {
		System.out.println("EMP Name "+name+" EMP ID "+id+" EMP Salary "+sal);
	
	}
	
	
}
