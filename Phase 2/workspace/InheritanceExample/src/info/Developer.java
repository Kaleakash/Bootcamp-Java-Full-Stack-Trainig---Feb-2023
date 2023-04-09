package info;

public class Developer extends Employee{

	private String tech;
	public void readDev() {
		readEmp();
		System.out.println("Enter the technology name");
		tech= sc.next();
	}
	public void disDev() {
		disEmp();
		System.out.println("technology name is "+tech);
	}
}
