package abc;

public class Employee {
	private String name;				// instance variable 
	private float salary;	
	
	Employee() {
    	System.out.println("object created..");
    	name="Unknown";
    	salary = 8000;
	}
	Employee(String name, float salary){		// parameter variable or local variable 
		this.name = name;			// instance variable = local variable 
		if(salary<0) {
			this.salary = 8000;
		}else {
			this.salary = salary;
		}
	}
	void setValue(String name, float salary) {
		this.name = name;
		//this.salary = salary;
		if(salary<0) {
			this.salary = 8000;
		}else {
			this.salary = salary;
		}
	}
	void display() {
		System.out.println("This is employee display method");
		System.out.println("name is "+name);
		System.out.println("salary is "+salary);
	}
}
