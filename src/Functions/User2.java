package Functions;

public class User2 {

	public static void main(String[] args) {

      Car car1=new Car("Swift","Sedan",4,"White"); //car1
      /*car1.name="Swift";
      car1.color="White";
      car1.model="Sedan";
      car1.wheels=4;*/
      
      car1.transport();    //non static member call by object of car class
      car1.specification();
      
      Car car2=new Car("i20","Magna",4,"Red");   //car2
      
      car2.transport();    //non static member call by object of car class
      car2.specification();
      
	}

}
