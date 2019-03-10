package OOPSAbstraction;  //Runtime polymorphism OR Runtime Binding

public class BankUser2 {

	public static void main(String[] args) {
		RBI obj=null;               
		String bank="HDFC";
		
		if(bank.equals("ICICI"))
		{
			obj=new ICICI();	
		}else if(bank.equals("PNB"))
				{
			obj=new PNB();
				}else if(bank.equals("HDFC"))
						{
		obj=new HDFC();           	
						}
		
		
		
		
		obj.moneyTransfer();
		obj.Loan();
		obj.InternetBanking();

	}

}
