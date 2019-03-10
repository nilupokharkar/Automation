package ConditionalStatements;  //+ for concatenation

public abstract class Testing5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String name="Nilima";
String surname="Chokhar";
int a=10;
int b=20;


System.out.println(name+surname);  //string+string

System.out.println(a+b+name+surname);   //int+int+string+string
System.out.println(a+name+b+surname);  //int+string+int+string
System.out.println(name+(a+b)+surname);  //string+(int+int)+string
	}

}
