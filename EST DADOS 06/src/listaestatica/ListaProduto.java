package listaestatica;

/** representa uma lista estática de {@link listaestatica.Produto} */
public class ListaProduto
{
	/** tamanho máximo da lista estática */
	private int capacidade;
	/** tamanho atual da lista estática */
	private int quantidadeProdutos = 0;
	/** array de produtos da lista estática */
	private Produto dados[];
	
	/** construtor da lista estática @ */ 
	public ListaProduto(int capacidade)
	{
		this.capacidade = capacidade;
		dados = new Produto[capacidade];
	}
	
	public int getQuantidadeProdutos()
	{
		return quantidadeProdutos;
	}

	public int getTamanho()
	{
		return capacidade;
	}

	public boolean isVazia()
	{
		return quantidadeProdutos == 0;
	}

	public boolean isCheia()
	{
		return quantidadeProdutos == capacidade;
	}

	public boolean adicionar(Produto produto)
	{
		if (isCheia())
			return false;
		dados[quantidadeProdutos] = produto;
		quantidadeProdutos++;
		return true;
	}

	/** remove um produto usando o indice como referencia
	 * @param indice valor do indice do produto a ser removido */
	public boolean removerPorIndice(int indice)
	{
		if (isVazia())
			return false;
		for (int i = indice; i < quantidadeProdutos - 1; i++)
			dados[i] = dados[i+1];
		quantidadeProdutos--;
		dados[quantidadeProdutos] = null;
		return true;
	}

	/** remove um produto usando {@link listaestatica.Produto#getCodigo()} 
	 * @param codigoProduto codigo do Produto a ser removido */
	public boolean removerPorCodigo(int codigoProduto)
	{
		if (isVazia())
			return false;
		int x = 0;
		while (x < quantidadeProdutos && dados[x].getCodigo() != codigoProduto)
			x++;
		// se nao achou produtos com o codigoProduto
		if (x == quantidadeProdutos)
			return false;
		for (int i = x; i < quantidadeProdutos - 1; i++)
			dados[i] = dados[i + 1];
		quantidadeProdutos--;
		dados[quantidadeProdutos] = null;
		return true;
	}

	public Produto get(int i)
	{
		if (isVazia())
		{
			return null;
		}
		return dados[i];
	}

	// adicionar
	// remover por indice
	// remover por codigo
	// buscar
	// consultar Tamanho
	// Verificar se está cheio
	// Verificar se está vazio
}
