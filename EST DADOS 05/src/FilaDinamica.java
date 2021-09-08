/** Representa uma Fila Din�mica */
public class FilaDinamica<T>
{
	/** primeiro n� da fila din�mica */
	private No primeiro;
	/** �ltimo n� da fila din�mica */
	private No ultimo;
	/** tamanho atual da fila (quantos n�s ela possui) */
	private int tamanho;

	/**
	 * Se a fila din�mica est� vazia (sem n�s)
	 * 
	 * @return verdadeiro se tamanho = 0
	 */
	public boolean isVazia()
	{
		return tamanho == 0;
	}

	/**
	 * O tamanho da fila din�mica (quantos n�s ela possui)
	 * 
	 * @return tamanho
	 */
	public int getTamanho()
	{
		return tamanho;
	}

	/**
	 * Insere um n� na fila din�mica
	 * 
	 * @param t
	 *            Elemento a ser inserido
	 */
	public void inserir(T t)
	{
		/** n� a ser inserido */
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
	 * remove o primeiro n� da fila din�mica
	 * 
	 * @return false se a fila j� estava vazia
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
	 * retorna o elemento do primeiro n�
	 * 
	 * @return null se a fila est� vazia
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

	/** Classe que representa um n� para a fila din�mica */
	private class No
	{
		/** o n� em sequ�ncia (pr�ximo) ap�s este n� */
		No proximo;
		/** o elemento em si, deste n� */
		T t;
	}
}
