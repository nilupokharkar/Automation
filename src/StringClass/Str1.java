package StringClass;

public class Str1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str="Nilima Chokhar";
		//Length
		System.out.println(str.length());
		
		//Trim    (Remove spaces)
		System.out.println(str.trim());
		
		//Char At
		System.out.println(str.charAt(5));
		
		//Sub String
		String str2=str.substring(0, 6);//(beginindex,Endindex)
		System.out.println(str2);
		
		String str3=str.substring(7);
		System.out.println(str3);
		
		//
		String str4=" nilima ";
		/*System.out.println(str4.trim());
		String str5=str4.substring(0);
		System.out.println(str5);*/
		
		//
		String str6=str4.trim();
		String str5=str6.substring(0);
		System.out.println(str5);
		
		//Replace char by char or word by word
		//String str7=str.replace(" ", "");
		String str7=str.replace("a", "z");
		System.out.println(str7);
		
		
		//Split
		String[] arr=str.split(" "); //break the string by considering space
		
		int l=arr.length;
		System.out.println(l); //Split original into  2 parts
		
		
		System.out.println(arr[0]); //arr[0]=Nilima
		System.out.println(arr[1]);  //arr[1]=Chokhar
		
		//Equals & EqualIgnoreCase
		
		String a="Anand";  //e.g Login word, use for verifying text
		String b="anand";
		
		System.out.println(a.equals(b));
		System.out.println(a.equalsIgnoreCase(b));
		/*int al=0;
		String[] st=new String[6];
		st[0]="a";
		st[1]="n";
		st[2]="a";
		st[3]="n";
		st[4]="d";
		String b1="a";
		for(int s=0;s<4;s++)
		{
			if(st[s].equals(b1))
			{
				al++;
			}
				
		}
		System.out.println(al);*/
		
		
		
		
		
	}

}
