package listaestatica;

public class Programa
{
	public static void main(String[] args)
	{
		ListaProduto lista = new ListaProduto(4);

		Produto produto1 = new Produto(45, "Água", 2.50f, 5);
		Produto produto2 = new Produto(97, "Mascara", 7.99f, 20);
		Produto produto3 = new Produto(12, "Sabão", 1.99f, 3);
		Produto produto4 = new Produto(82, "Feijão", 3.40f, 1);

		lista.adicionar(produto1);
		lista.adicionar(produto2);

		System.out.println("--- Primeira Listagem ---");
		for (int i = 0; i < lista.getQuantidadeProdutos(); i++)
		{
			Produto p = lista.get(i);
			System.out.println(p);
		}
		lista.adicionar(produto4);
		lista.adicionar(produto3);
		System.out.println("--- Segunda Listagem ---");
		for (int i = 0; i < lista.getQuantidadeProdutos(); i++)
		{
			Produto p = lista.get(i);
			System.out.println(p);
		}
		Produto produto5 = new Produto(51, "Pitu", 4.99f, 1);
		if (!lista.adicionar(produto5))
		{
			System.out.println("Não foi possível adicionar produto : " + produto5);
		}

		lista.removerPorCodigo(45);
//		lista.removerPorIndice(1);
		System.out.println("--- Terceira Listagem ---");
		for (int i = 0; i < lista.getQuantidadeProdutos(); i++)
		{
			Produto p = lista.get(i);
			System.out.println(p);
		}
	}
}
