package MyExcersize;

import java.util.Scanner;

public class EmployeeTest {

	public static void main(String[] args ) {
		// TODO Auto-generated method stub

		Employee[] emp = new Employee[10];
		int j;
		System.out.println("How many employee want to add?");
		Scanner scan = new Scanner(System.in);
		j=scan.nextInt();
		
		for(int i=0;i<j;i++) {
			emp[i]= new Employee();
				}
		for(int i=0;i<j;i++) {
			emp[i].inputdata();
						
		}
		
		for(int i=0;i<j;i++) {
			System.out.println("Employee Details");
			emp[i].printdata();
		}
		
		//Change position of Employee and add new in middle and new one
		//take the position at which employee need to add = POS
		//place holder object is used to save new employee data = emp1
		//shift the employee from that position till end
		System.out.println("Want to add new employee in the middle?");
		System.out.println("Enter position");
		System.out.println();
		int pos = scan.nextInt();

		//save data in place holder
		Employee empabc= new Employee();
		System.out.println();
		System.out.println("----------------");
		empabc.printdata();
		
		int x = j+1; // add 1 to last position no
		int y = pos; // to replace values to the next position.
		
		for(;x>=y;x--) {
		emp[x]=emp[x-1];
		}
		
		System.out.println("------------Input new data--------------");
		emp[pos].inputdata();
		emp[pos].printdata();//to check input value
		System.out.println("------------------------------");
				
		 for(int z=0;j<=j+1;z++) {
			 emp[z].printdata();
		 }
		
	}

}
