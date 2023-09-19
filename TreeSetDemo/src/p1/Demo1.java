package p1;

import java.util.TreeSet;



public class Demo1 {

	public static void main(String[] args) {
		
		TreeSet<String> set = new TreeSet<>();
		
		set.add("ab");
		set.add("aab");
		set.add("aba");
		set.add("abc");
		set.add("abbc");
		
		System.out.println(set);
		
		
		
	}//end main
}//end class
