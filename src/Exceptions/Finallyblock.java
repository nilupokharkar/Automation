package Exceptions;

public class Finallyblock {

	public static void main(String[] args) {
int a=10;
int b=0;

try
{
	int c=a/b;
	System.out.println(c);
}catch(Exception e)
{
	System.out.println(e.getMessage());
}finally
{
	System.out.println("Finally block executes");
}

	}

}
