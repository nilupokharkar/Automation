package OOPSInheritance;

public class User {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Smartphone phone=new Smartphone();
    phone.internet();
    phone.texting();
    phone.calling();
    
    Telephone p=new Telephone();
    p.calling();
    
	}

}
