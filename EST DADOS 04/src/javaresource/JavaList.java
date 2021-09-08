package javaresource;

import java.util.ArrayList;
import java.util.List;

public class JavaList
{
	public static void main(String[] args)
	{
		List<String> nomes = new ArrayList<String>();
		nomes.add("Jadson");
		nomes.add("Alex");
		nomes.add("Shaco");
		
		System.out.println("Todos:");
		for(String s: nomes) {
			System.out.println(s);
		}
		
		System.out.println("\nIndice 2:");
		System.out.println(nomes.get(2));
	}
}
