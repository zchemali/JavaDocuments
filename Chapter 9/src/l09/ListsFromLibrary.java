package l09;

import java.util.List;
import java.util.ArrayList;

public class ListsFromLibrary {

	public static void main(String[] args) {
		List <Double> d =new  ArrayList <Double>();
		
		d.add(1.2);
		d.add(-1.0);
		d.add(4.0);
		System.err.println("\n---Before Changes---");
		for (double n :d)
			System.out.println(n);
		
		d.set(0, 5.0);
		d.add(6.0);
		d.remove(2);
		System.err.println("\n---After Changes---");
		//printing either the standard for loop or
		for (double x :d)
			System.out.println(x);
		
		
		
	}

}
