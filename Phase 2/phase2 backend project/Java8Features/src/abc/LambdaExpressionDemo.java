package abc;
interface A {
	void dis1();
}
class B implements A {
	public void dis1() {
		System.out.println(" A interface method body provided by B class");
	}
}
public class LambdaExpressionDemo {
	public static void main(String[] args) {
		// 1st way 
		A obj1  = new B();
		obj1.dis1();
		//2nd way 
		A obj2 = new A() {
			public void dis1() {
				System.out.println(" A interface method body provided by anonymous inner class - one way logic ");
			}
		};
		obj2.dis1();
		A obj3 = new A() {
			public void dis1() {
				System.out.println(" A interface method body provided by anonymous inner class - another way logic ");
			}
		};
		obj3.dis1();
		// 3rd way to provide the body using lambda expression 
		A obj4 = ()->{
			
			System.out.println("This is lambda expression");
			
		};
		obj4.dis1();
	}

}



