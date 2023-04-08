import java.util.Scanner;		// importing pre defined package. 
import java.lang.String;
//import org.springframework.*;
public class TakingValueThroughKeyboards {

	public static void main(String[] args) {
	
		String name = "Steven";
		System.out.println(name);
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the id");
		int id = sc.nextInt();   //scan int value and store in id variable
		System.out.println("id is "+id);
		System.out.println("Enter the name");
		String fname = sc.next();
		System.out.println("FName is "+fname);
		System.out.println("Enter the salary");
		float salary = sc.nextFloat();
		System.out.println("Salary is "+salary);
		
	}

}
