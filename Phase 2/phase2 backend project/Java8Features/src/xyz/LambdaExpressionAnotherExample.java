package xyz;
interface Operation {
	public int add(int x, int y);
}
public class LambdaExpressionAnotherExample {
	public static void main(String[] args) {
		Operation op1 = (int x, int y)->x+y;
		System.out.println("Addition of two number is "+op1.add(10, 20));
		
		Operation op2 = (int a, int b)->a+b;
		System.out.println("Addition of two number is "+op2.add(30, 40));
		
		Operation op3 = (m,n)->m+n;
		System.out.println("Addition of two number is "+op3.add(50, 60));
	
		Operation op4 = (m,n)-> {
			int sum  = m+n;
			return sum;
		};
		System.out.println("Addition of two number is "+op4.add(70, 80));
	}

}
