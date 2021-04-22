package trail;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import org.openqa.selenium.WebElement;

public class Collections {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> list=new ArrayList<String>();
		list.add("Sathya");
		list.add("Narayanan");
		list.add("Sathya");
		
		System.out.println(list);
		
		
		List<String> list1=new LinkedList<String>();
		list1.add("Sathya");
		list1.add("Narayanan");
		list1.add("Sathya");
		
		System.out.println(list1);
		
		
		Set<String> set=new HashSet<String>();
		set.add("Sathya");
		set.add("Narayanan");
		set.add("Sathya");
		
		System.out.println(set);
		
		
		Set<String> set1=new TreeSet<String>();
		set1.add("Sathya");
		set1.add("Narayanan");
		set1.add("Sathya");
		
		System.out.println(set1);
		
	}

}
