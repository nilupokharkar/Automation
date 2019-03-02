package Arrays;

public class Array1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      String[] str=new String[4];
      str[0]="Swapnil";
      str[1]="Pradnya";
      str[2]="Anjali";
      str[3]="Nilima";
      System.out.println(str[3]);
      
      //enhance for loop ....extracting array and collections
      
    /*  System.out.println(str.length);
      for(int i=0;i<str.length;i++)
      {
    	  System.out.println(str[i]);
      }*/
      
      for(String s:str)     //  syntax  (datatype of array local var:array name) 
      {
    	  System.out.println(s);
      }
		
	}

}
