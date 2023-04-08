package abc;

public class Employee {
	String name;				// instance variable 
	float salary;	
	
	Employee() {
    	System.out.println("object created..");
    	name="Unknown";
    	salary = 8000;
	}
	Employee(String name, float salary){		// parameter variable or local variable 
		this.name = name;			// instance variable = local variable 
		this.salary =salary;
	}
	void setValue(String name, float salary) {
		this.name = name;
		this.salary = salary;
	}
	void display() {
		System.out.println("This is employee display method");
		System.out.println("name is "+name);
		System.out.println("salary is "+salary);
	}
}
