package circularEncadeada;

public class Teste
{
	public static void main(String[] args)
	{
		ListaCircular<String> listaCircular = new ListaCircular<String>();

		listaCircular.inserir("Jadson");
		listaCircular.inserir("Alex");
		listaCircular.inserir("Bob");

		for (int i = 0; i < listaCircular.getTamanho(); i++)
		{
			System.out.println(i + " " + listaCircular.get(i));
		}
	}
}
