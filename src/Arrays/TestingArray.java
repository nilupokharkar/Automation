package Arrays;

public class TestingArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Array1 obj1=Array1.fun(); //these two lines works same
		Array1 obj2=new Array1();
		
		System.out.println(obj2.name);
		obj2.test();
		
		System.out.println(obj1.name);
		obj1.test();
	}

}
