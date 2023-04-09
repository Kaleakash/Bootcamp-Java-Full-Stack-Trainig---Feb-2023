package info;

public class Manager extends Employee{

	private int numberofEmp;
	Address add = new Address();
	public void readMgr() {
		readEmp();
		System.out.println("Enter the number of employee working under him");
		numberofEmp = sc.nextInt();
		add.readAdd();
	}
	public void disMgr() {
		disEmp();
		System.out.println("number of employee working under him"+numberofEmp);
		add.disAdd();
	}
}
