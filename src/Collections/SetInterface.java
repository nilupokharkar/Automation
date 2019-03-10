package Collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class SetInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashSet<String>set=new HashSet<>();     //case sensitive (Random order)
		set.add("Priyanka");
		set.add("Priyanka");
		set.add("Nilima");
		set.add("Lokesh");
		set.add("abc");
		for(String s:set){
			System.out.println(s);
		}
		
		LinkedHashSet<String>set2=new LinkedHashSet<>();     //as per the insertion order
		set2.add("Priyanka");
		set2.add("Priyanka");
		set2.add("Nilima");
		set2.add("Lokesh");
		set2.add("abc");
		for(String s:set2){
			System.out.println(s);
		}
		
		TreeSet<String>set3=new TreeSet<>();     //Sorted array A-Z first capital then small letter
		set3.add("Priyanka");
		set3.add("Priyanka");
		set3.add("Nilima");
		set3.add("Lokesh");
		set3.add("abc");
		for(String s:set3){
			System.out.println(s);
		}
	}

}
