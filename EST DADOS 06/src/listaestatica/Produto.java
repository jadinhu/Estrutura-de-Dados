package listaestatica;

/** representa um produto qualquer de e-commerce*/
public class Produto
{
	private int codigo;
	private String descricao;
	private float preco;
	private int quantidade;

	public Produto(int codigo, String descricao, float preco, int quantidade)
	{
		super();
		this.codigo = codigo;
		this.descricao = descricao;
		this.preco = preco;
		this.quantidade = quantidade;
	}

	public int getCodigo()
	{
		return codigo;
	}

	public void setCodigo(int codigo)
	{
		this.codigo = codigo;
	}

	public String getDescricao()
	{
		return descricao;
	}

	public void setDescricao(String descricao)
	{
		this.descricao = descricao;
	}

	public float getPreco()
	{
		return preco;
	}

	public void setPreco(float preco)
	{
		this.preco = preco;
	}

	public int getQuantidade()
	{
		return quantidade;
	}

	public void setQuantidade(int quantidade)
	{
		this.quantidade = quantidade;
	}

	@Override
	public String toString()
	{
		return "Produto [codigo=" + codigo + ", descricao=" + descricao + "]";
	}
}
