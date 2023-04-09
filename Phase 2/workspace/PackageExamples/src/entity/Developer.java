package entity;
import bean.Employee;
public class Developer extends Employee{

	public void disDeveloperInfo() {
		//System.out.println(" id "+id);		// private 
		//System.out.println(" name "+name);	// default 
		System.out.println(" salary "+salary);
		System.out.println(" desg "+desg);
	}
}
