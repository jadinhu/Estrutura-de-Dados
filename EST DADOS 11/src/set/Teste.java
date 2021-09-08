package set;

import java.util.Set;
import java.util.TreeSet;

public class Teste
{
	public static void main(String[] args)
	{
		Set<Integer> elementos = new TreeSet();
		elementos.add(125);
		elementos.add(125);
		elementos.add(125);
		elementos.add(125);
		System.out.println(elementos.size());
		elementos.add(2222);
		System.out.println(elementos.size());
	}
}
