package info;

public class DemoTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Employee emp = new Employee();
		System.out.println("Enter the manager details");
		Manager mgr = new Manager();
		//mgr.readEmp();
		mgr.readMgr();
		System.out.println("Enter the developer details");
		Developer dev = new Developer();
		//dev.readEmp();
		dev.readDev();
		
		//mgr.disEmp();
		mgr.disMgr();
		//dev.disEmp();
		dev.disDev();
	}

}
