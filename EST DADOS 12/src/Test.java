
public class Test
{
	public static void main(String[] args)
	{
		ArvoreBinaria a = new ArvoreBinaria();

		a.inserir(10);
		a.inserir(22);
		a.inserir(2);
		a.inserir(9);
		a.inserir(1);

		a.imprimir();
		
		System.out.println("Testes:");
		System.out.println("Consultar o elemento 100: " + a.consultar(100));
		System.out.println("Consultar o elemento 15: " + a.consultar(15));
		System.out.println("Altura da arvore: " + a.getAltura());
		System.out.println("Quantidade de elementos: " + a.getQuantidadeElementos());
		System.out.println("Se a arvore está vazia: " + a.isVazia());
		System.out.println("Remover o elemento 15: " + a.remover(15));
		System.out.println("Consultar o elemento 15: " + a.consultar(15));
		System.out.println("Imprimir a arvore:");
		a.imprimir();
	}
}
