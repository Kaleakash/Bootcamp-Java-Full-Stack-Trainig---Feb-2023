package xyz;

public class EmployeeTest {

	public static void main(String[] args) {
	//1st approach 
		Employee emp1 = new Employee();
		emp1.setId(100);
		emp1.setName("Ravi");
		emp1.setSalary(120000);
		
		Employee emp2 = new Employee(101, "Ramesh", 14000);
		
		
		System.out.println("id is "+emp1.getId());
		System.out.println("name is "+emp1.getName());
		System.out.println("salary is "+emp1.getSalary());
		
		
		System.out.println("id is "+emp2.getId());
		System.out.println("name is "+emp2.getName());
		System.out.println("salary is "+emp2.getSalary());
	}

}
