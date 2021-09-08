package duplamentaEncadeada;

public class ListaDuplamenteEncadeada<T>
{
	/** o 'start' da lista */
	private No primeiro = null;
	/** tamanho atual da lista */
	private int tamanho = 0;

	public boolean isVazia()
	{
		return tamanho == 0;
	}

	public void inserir(T t)
	{
		No no = new No();
		no.elemento = t;
		if (isVazia())
		{
			primeiro = no;
		}
		else
		{
			No aux = primeiro;
			while (aux.proximo != null)
			{
				aux = aux.proximo;
			}
			aux.proximo = no;
			no.anterior = aux;
		}
		tamanho++;
	}

	public boolean remover(T t)
	{
		if (isVazia())
		{
			return false;
		}
		No aux = primeiro;
		while (aux != null && aux.elemento != t)
		{
			aux = aux.proximo;
		}
		if (aux == null)
		{
			return false;
		}
		if (aux.anterior == null)
		{
			primeiro = aux.proximo;
		}
		else
		{
			aux.anterior.proximo = aux.proximo;
		}
		if (aux.proximo != null)
		{
			aux.proximo.anterior = aux.anterior;
		}
		tamanho--;
		return true;
	}

	public T consultar(int posicao)
	{
		if (posicao < 0 || posicao >= tamanho)
		{
			return null;
		}
		int i = 0;
		No aux = primeiro;
		while (aux != null && i < posicao)
		{
			aux = aux.proximo;
			i++;
		}
		if (aux == null)
		{
			return null;
		}
		return aux.elemento;
	}
	
	public int getTamanho()
	{
		return tamanho;
	}

	private class No
	{
		T elemento;
		No anterior;
		No proximo;
	}
}
