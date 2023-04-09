package com;
class Employee {
	int id;
	String name;
	static int mgrId;
	void disEmpInfo() {
		System.out.println("id is "+id);
		System.out.println("name is "+name);
		System.out.println("manager id is "+mgrId);
	}
}
public class StaticAnotherExample {
	public static void main(String[] args) {
		Employee emp1 = new Employee();			// heap memory 
		Employee emp2 = new Employee();
		emp1.id=100;
		emp1.name="Lex";
		emp1.mgrId=123;
		Employee.mgrId=124;
		
		emp2.id=101;
		emp2.name="Neena";
		emp2.mgrId=125;
		Employee.mgrId=126;
		emp1.disEmpInfo();
		emp2.disEmpInfo();
	}

}
