package circularEncadeada;

public class ListaCircular<T>
{
	private No primeiro = null;

	public int getTamanho()
	{
		if (primeiro == null)
		{
			return 0;
		}
		int tamanho = 1;
		No aux = primeiro;
		while (aux.proximo != primeiro)
		{
			tamanho++;
			aux = aux.proximo;
		}
		return tamanho;
	}

	public boolean isVazia()
	{
		return primeiro == null;
	}

	public void inserir(T t)
	{
		No no = new No();
		no.elemento = t;
		if (primeiro == null)
		{
			no.proximo = no;
			primeiro = no;
		}
		else
		{
			No aux = primeiro;
			while (aux.proximo != primeiro)
			{
				aux = aux.proximo;
			}
			aux.proximo = no;
			no.proximo = primeiro;
		}
	}

	public boolean remover(T t)
	{
		if (primeiro == null)
		{
			return false;
		}
		No aux = primeiro;
		if (aux.elemento == t)
		{
			if (aux.proximo == primeiro)
			{
				primeiro = null;
			}
			else
			{
				No ultimo = primeiro;
				while (ultimo.proximo != primeiro)
				{
					ultimo = ultimo.proximo;
				}
				ultimo.proximo = primeiro.proximo;
				primeiro = primeiro.proximo;
			}
			return true;
		}
		No anterior = aux;
		aux = aux.proximo;
		while (aux != primeiro && aux.elemento != t)
		{
			anterior = aux;
			aux = aux.proximo;
		}
		if (aux == primeiro)
		{
			return false;
		}
		anterior.proximo = aux.proximo;
		return true;
	}

	public T get(int posicao)
	{
		if (posicao < 0 || isVazia())
		{
			return null;
		}
		No aux = primeiro;
		int i = 0;
		while (aux.proximo != primeiro && posicao < i)
		{
			aux = aux.proximo;
			i++;
		}
		if (i != posicao)
		{
			return null;
		}
		return aux.elemento;
	}

	private class No
	{
		T elemento;
		No proximo;
	}
}
