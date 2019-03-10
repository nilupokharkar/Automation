package OOPSAbstraction;

public class BankUser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
RBI obj;                            // e.g. int a
		obj=new HDFC();            //  a=10
		obj.moneyTransfer();       //a=20
		obj.Loan();
		obj.InternetBanking();
		
		obj=new ICICI();
		obj.moneyTransfer();
		obj.Loan();
		obj.InternetBanking();
		
		obj=new PNB();
		obj.moneyTransfer();
		obj.Loan();
		obj.InternetBanking();
	}

}
