
public class ArrayExample {

	public static void main(String[] args) {
//		int num1[];	// array declaration 
//	int num2[]= {10,20,30,40,50}; 
//		System.out.println(num2);
//		System.out.println(num2[0]);
//		System.out.println(num2[1]);
//		//System.out.println(num2[6]);
//		System.out.println("display value one by one");
//		for(int i=2;i<4;i++) {			// i++ = i+1
//			System.out.println(num2[i]);
//		}
//		System.out.println("display the value using for each loop");
//		for(int n:num2) {
//			System.out.println(n);
//		}
		int num[]=new int[10];	// syntax to create the memory size for the array 
		System.out.println("Default value "+num[0]);
		System.out.println("default value "+num[9]);
		num[0]=100;
		num[1]=200;
		System.out.println("Value in 0 index position is "+num[0]);
		System.out.println("Value in 1 index position is "+num[1]);
		int temp=123;
		for(int i=0;i<num.length;i++) {
			num[i]=temp;
			temp++;
		}
		System.out.println("Array values are ");
		for(int n:num) {
			System.out.println(n);
		}
	}

}
