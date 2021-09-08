
public class TesteFilaEstatica
{
	public static void main(String[] args)
	{
		FilaEstatica<String> fila = new FilaEstatica<String>(5);
		fila.inserir("aaa");
		fila.inserir("bbb");
		fila.inserir("ccc");
		fila.inserir("ddd");
		fila.inserir("eee");
		for (int i = 0; i < 5; i++)
		{
			System.out.println(fila.remover());
		}
	}
}
