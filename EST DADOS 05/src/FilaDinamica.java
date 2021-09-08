/** Representa uma Fila Dinâmica */
public class FilaDinamica<T>
{
	/** primeiro nó da fila dinâmica */
	private No primeiro;
	/** último nó da fila dinâmica */
	private No ultimo;
	/** tamanho atual da fila (quantos nós ela possui) */
	private int tamanho;

	/**
	 * Se a fila dinâmica está vazia (sem nós)
	 * 
	 * @return verdadeiro se tamanho = 0
	 */
	public boolean isVazia()
	{
		return tamanho == 0;
	}

	/**
	 * O tamanho da fila dinâmica (quantos nós ela possui)
	 * 
	 * @return tamanho
	 */
	public int getTamanho()
	{
		return tamanho;
	}

	/**
	 * Insere um nó na fila dinâmica
	 * 
	 * @param t
	 *            Elemento a ser inserido
	 */
	public void inserir(T t)
	{
		/** nó a ser inserido */
		No no = new No();
		no.t = t;
		no.proximo = null;
		if (isVazia())
		{
			primeiro = no;
			ultimo = no;
		}
		else
		{
			ultimo.proximo = no;
			ultimo = no;
		}
		tamanho++;
	}

	/**
	 * remove o primeiro nó da fila dinâmica
	 * 
	 * @return false se a fila já estava vazia
	 */
	public boolean remover()
	{
		if (isVazia())
			return false;
		if (tamanho == 1)
		{
			primeiro = null;
			ultimo = null;
		}
		else
		{
			primeiro = primeiro.proximo;
		}
		tamanho--;
		return true;
	}

	/**
	 * retorna o elemento do primeiro nó
	 * 
	 * @return null se a fila está vazia
	 */
	public T get()
	{
		if (isVazia())
			return null;
		return primeiro.t;
	}

	public T getLast()
	{
		if (isVazia())
			return null;
		return ultimo.t;
	}

	/** Classe que representa um nó para a fila dinâmica */
	private class No
	{
		/** o nó em sequência (próximo) após este nó */
		No proximo;
		/** o elemento em si, deste nó */
		T t;
	}
}
