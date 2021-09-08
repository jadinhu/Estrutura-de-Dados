
public class TestPilhaDinamica
{
	public static void main(String[] args)
	{
		PilhaDinamica<Integer> pilha = new PilhaDinamica<Integer>();
		pilha.inserir(111);
		System.out.println(pilha.getTamanho());
		System.out.println(pilha.isVazia());
		
		PilhaDinamica<Float> pilha2 = new PilhaDinamica<Float>();
		pilha2.inserir(111.52f);
		System.out.println(pilha2.getTamanho());
		System.out.println(pilha2.isVazia());
		System.out.println("---------");
		Champion c1 = new Champion();
		c1.nome = "Hecarim";
		Champion c2 = new Champion();
		c2.nome = "Leona";
		PilhaDinamica<Champion> pilha3 = new PilhaDinamica<Champion>();
		pilha3.inserir(c1);
		pilha3.inserir(c2);
		System.out.println(pilha3.getTamanho());
		System.out.println(pilha3.isVazia());
		System.out.println(pilha3.get().nome);
		System.out.println(pilha3.getTamanho());
		System.out.println(pilha3.pop().nome);
		System.out.println(pilha3.getTamanho());
		System.out.println(pilha3.pop().nome);
		System.out.println(pilha3.getTamanho());
		System.out.println(pilha3.isVazia());
		System.out.println(pilha3.pop().nome);
	}
}
