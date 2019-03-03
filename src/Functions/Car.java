package Functions;  //Constructor

public class Car 
{	String name;//="Hexa";
	String model;//="SUV";
	int wheels;//=4;
	String color;//="Red";
	
	public Car(String name,String model,int wheels,String color)  // constructor
	{
		this.name=name;  //always points to the instance variable
		this.model=model;
		this.wheels=wheels;
		this.color=color;
	}
	//constructor overloading
	public Car()
	{
		
	}
public  static void drive()
{
	//Car c=new Car();
	//System.out.println("The "+c.name+" car of model"+c.model+" have"+c.wheels+" wheels and in "+c.color+" color");
}
public void transport()
{
	System.out.println("The "+name+" car transports passengers from Pune to Mumbai");
}
public void specification()
{
	System.out.println("The "+name+" car of model"+model+" have"+wheels+" wheels and in "+color+" color");
}
	
}
