package Functions;

public class Functions {

	public static int sum(int a,int b)
	{
		
		//System.out.println(a+b);
		//return a+b;
		int c=a+b;
		return c;
	}
	public static int multiply(int a,int b)
	{
		return a*b;
	}
	
	public int interestCalculator(int p,int r,int n)  //non static function
	{
		return (p*r*n)/100;
	}
	
	public int mod(int a,int b)                           //non static function
	{ 
		return a%b;
	}
}
