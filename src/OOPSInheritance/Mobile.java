package OOPSInheritance;

public class Mobile extends Telephone{

	public void texting()
	{
		System.out.println("Texting from Mobile");
	}
	public void calling()    //redefined in Method Overriden (Telephone)
	{
		System.out.println("Calling from Mobile");
	}

}
