public class Pilha
{
	public Object[] pilha;
	public int indiceDoTopo;

	public Pilha()
	{
		this.indiceDoTopo = -1;
		// indica que esta nula, vazia, pois posição um indica que contém
		// informação
		this.pilha = new Object[1000];
		// criando uma pilha com 1000 posições
	}

	public boolean pilhaVazia()
	{
		// isEmpty
		if (this.indiceDoTopo == -1)
		{
			return true;
		}
		return false;
	}

	public int tamanho()
	{
		// is
		if (this.pilhaVazia())
		{
			return 0;
		}
		return this.indiceDoTopo + 1;
	}

	public Object exibeUltimoValor()
	{
		// top
		if (this.pilhaVazia())
		{
			return null;
		}
		return this.pilha[this.indiceDoTopo];
	}

	public Object desempilhar()
	{
		// pop
		if (pilhaVazia())
		{
			return null;
		}
		return this.pilha[this.indiceDoTopo--];
	}

	public void empilhar(Object valor)
	{
		// push
		if (this.indiceDoTopo < this.pilha.length - 1)
		{
			this.pilha[++indiceDoTopo] = valor;
		}
	}

	public static void main(String args[])
	{
		Pilha pizza = new Pilha();
		pizza.empilhar("Portuguesa ");
		pizza.empilhar("Frango com catupiry ");
		pizza.empilhar("Calabresa ");
		pizza.empilhar("Quatro queijos ");
		pizza.empilhar(10);
		while (pizza.pilhaVazia() == false)
		{
			System.out.println(pizza.desempilhar());
		}
	}
}