package duplamentaEncadeada;

public class Teste
{
	public static void main(String[] args)
	{
		ListaDuplamenteEncadeada<String> lista = new ListaDuplamenteEncadeada<String>();

		lista.inserir("Jadson");
		lista.inserir("Alex");
		lista.inserir("Bob");

		for (int i = 0; i < lista.getTamanho(); i++)
		{
			System.out.println(i + " " + lista.consultar(i));
		}
	}
}
