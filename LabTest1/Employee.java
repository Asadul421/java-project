package LabTest1;

public class Employee extends Person {
	//instance variables
		 String e_id;
		 String dept;
		 int salary;
		
		//default constructor
		public Employee() {
		
			
		}
		//parameterized constructor
		public Employee(String e_id, String dept, int salary) {
			
			this.e_id = e_id;
			this.dept = dept;
			this.salary = salary;
		}
		//to display the value
		public void displayEmp()
		{
			System.out.println("Employee id :"+e_id);
			System.out.println("Department :"+dept);
			System.out.println("salary :"+salary);
		}

}
