
public class ArvoreBinaria
{
	private No raiz;

	public boolean isVazia()
	{
		return raiz == null;
	}

	public int getAltura()
	{
		if (isVazia())
		{
			return 0;
		}
		return getAltura(raiz);
	}

	private int getAltura(No no)
	{
		if (no == null)
		{
			return 0;
		}
		int alturaEsquerda = getAltura(no.esquerda);
		int alturaDireita = getAltura(no.direita);
		return alturaEsquerda > alturaDireita ? alturaEsquerda + 1 : alturaDireita + 1;
	}

	public int getQuantidadeElementos()
	{
		if (isVazia())
		{
			return 0;
		}
		return getQuantidadeElementos(raiz);
	}

	private int getQuantidadeElementos(No no)
	{
		if (no == null)
		{
			return 0;
		}
		int quantidadeEsquerda = getQuantidadeElementos(no.esquerda);
		int quantidadeDireita = getQuantidadeElementos(no.direita);
		return quantidadeEsquerda + quantidadeDireita + 1;
	}

	public boolean inserir(int dado)
	{
		No no = new No();
		no.dado = dado;
		no.direita = null;
		no.esquerda = null;
		if (raiz == null)
		{
			raiz = no;
			return true;
		}
		No atual = raiz;
		No anterior = null;
		while (atual != null)
		{
			anterior = atual;
			if (no.dado == atual.dado)
			{
				return false;
			}
			if (no.dado > atual.dado)
			{
				atual = atual.direita;
			}
			else
			{
				atual = atual.esquerda;
			}
		}
		if (no.dado > anterior.dado)
		{
			anterior.direita = no;
		}
		else
		{
			anterior.esquerda = no;
		}
		return true;
	}

	public boolean remover(int dado)
	{
		if (isVazia())
		{
			return false;
		}
		No atual = raiz;
		No anterior = null;
		while (atual != null)
		{
			if (dado == atual.dado)
			{
				if (atual == raiz)
				{
					raiz = removeAtual(atual);
				}
				else
				{
					if (anterior.direita == atual)
					{
						anterior.direita = removeAtual(atual);
					}
					else
					{
						anterior.esquerda = removeAtual(atual);
					}
				}
				return true;
			}
			anterior = atual;
			if (dado > atual.dado)
			{
				atual = atual.direita;
			}
			else
			{
				atual = atual.esquerda;
			}
		}
		return false;
	}

	private No removeAtual(No atual)
	{
		if (atual.esquerda == null)
		{
			return atual.direita;
		}
		No no1 = atual;
		No no2 = atual.esquerda;
		while (no2.direita != null)
		{
			no1 = no2;
			no2 = no2.direita;
		}
		if (no1 != atual)
		{
			no1.direita = no2.esquerda;
			no2.esquerda = atual.esquerda;
		}
		no2.direita = atual.direita;
		return no2;
	}

	public boolean consultar(int dado)
	{
		if (isVazia())
		{
			return false;
		}
		No atual = raiz;
		while (atual != null)
		{
			if (dado == atual.dado)
			{
				return true;
			}
			if (dado > atual.dado)
			{
				atual = atual.direita;
			}
			else
			{
				atual = atual.esquerda;
			}
		}
		return false;
	}

	public void imprimir()
	{
		if (isVazia())
		{
			System.out.println("Vazia");
		}
		imprimir(raiz);
	}

	private void imprimir(No no)
	{
		if (no != null)
		{
			System.out.println(no.dado);
			imprimir(no.esquerda);
			imprimir(no.direita);
		}
	}

	private class No
	{
		int dado;
		No esquerda;
		No direita;
	}
}
