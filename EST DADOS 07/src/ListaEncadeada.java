
public class ListaEncadeada<T>
{
	private No primeiroNo;
	
	/** contagem de quantos nós/elementos existem na lista */
	public int getTamanho()
	{
		int quantidade = 0;
		No no = primeiroNo;
		while (no != null)
		{
			quantidade++;
			no = no.proximoNo;
		}
		return quantidade;
	}

	public boolean isVazia()
	{
		return primeiroNo == null;
	}

	public void inserir(T t)
	{
		No no = new No();
		no.elemento = t;
		if (isVazia())
		{
			primeiroNo = no;
		}
		else
		{
			No aux = primeiroNo;
			while (aux.proximoNo != null)
			{
				aux = aux.proximoNo;
			}
			aux.proximoNo = no;
		}
	}

	public boolean remover(T t)
	{
		No noAnterior = null, no = primeiroNo;
		while (no != null && no.elemento != t)
		{
			noAnterior = no;
			no = no.proximoNo;
		}
		if (no == null)
		{
			return false;
		}
		if (no == primeiroNo)
		{
			primeiroNo = primeiroNo.proximoNo;
		}
		else
		{
			noAnterior.proximoNo = no.proximoNo;
		}
		return true;
	}

	public T consultar(int indice)
	{
		if (indice < 0)
			return null;
		No no = primeiroNo;
		int i = 0;
		while (no != null && i < indice)
		{
			no = no.proximoNo;
			i++;
		}
		return no == null ? null : no.elemento;
	}

	private class No
	{
		T elemento;
		No proximoNo;
	}
}
