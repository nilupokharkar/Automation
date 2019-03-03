package VariablesandDatatypes;

public class Revision {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for(int i=1;i<=10;i++)
		{
			System.out.println(i);
		}
		int a=10,b=20;
		if(a>b)
		{
			System.out.println("a is greatest");
		}
		//Array
		String[] str=new String[3];
		str[0]="Anand";
		str[1]="Bhayre";
		str[2]="Techbodhi";
		
		//10,true and Anand (3 different datatypes in one array)
		//Object is superclass of all the classes in java
		
		Object[] obj=new Object[3];
		obj[0]=10;
		obj[1]=true;
		obj[2]="Anand";
		
		
		
	}

}
