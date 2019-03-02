package ConditionalStatements;

public class Testing4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // Logical Operators
		
		int a=40;
		int b=20;
		int c=30;
		
		if(a>b && a>c)
		{
			System.out.println("a is greatest");
		}else
		{
			System.out.println();
		}
		if(a>b || (a>c && b<c))
		{
			System.out.println("a is greatest");
		}
	}

}
