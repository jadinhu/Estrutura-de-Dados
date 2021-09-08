import java.util.Stack;

public class PilhaNativa
{
	public Stack<String> pilha; // pilha de nomes

	public void empilhar(String nome)
	{
		pilha.push(nome); // eh a mesma coisa de pilha.add(nome)
	}

	public String retirar()
	{
		return pilha.pop(); // remove e entrega o item do top
	}

	public String observar()
	{
		return pilha.peek(); // observa o item do top sem removê-lo
	}

	public boolean estaVazia()
	{
		return pilha.isEmpty(); // true se a pilha está vazia
	}

	public int tamanho()
	{
		return pilha.size();
	}
	
	public int capacidade()
	{
		return pilha.capacity();
	}
	
	public int indiceDoNome(String nome)
	{
		return pilha.search(nome); // retorna o índice de um determinado nome
	}
}
