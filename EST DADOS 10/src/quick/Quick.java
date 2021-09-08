package quick;

public class Quick
{
	/** ordena um vetor de inteiros */
	public void ordenarVetorDeInteiros(int[] vetor)
	{
		ordenar(vetor, 0, vetor.length - 1);
	}

	/** Chama a divisão do vetor nos três vetores do conceito */
	private void ordenar(int[] vetor, int inicio, int fim)
	{
		if (fim > inicio)
		{
			// Chamada da rotina que ira dividir o vetor em 3 partes.
			int pivo = dividir(vetor, inicio, fim);
			// Chamada recursiva para redivisao do vetor de elementos menores
			// que o pivô
			ordenar(vetor, inicio, pivo - 1);
			// Chamada recursiva para redivisao do vetor de elementos maiores
			// que o pivô
			ordenar(vetor, pivo + 1, fim);
		}
	}

	/** divide o vetor e encontra o indice do pivô */
	private int dividir(int[] vetor, int inicio, int fim)
	{
		int pivo = vetor[inicio], i = inicio + 1, j = fim;

		while (i <= j)
		{
			// Vai correr o vetor ate que ultrapasse o outro ponteiro ou ate que
			// o elemento em questão seja menor que o pivô
			while (i <= j && vetor[i] <= pivo)
			{
				i++;
			}

			// Vai correr o vetor ate que ultrapasse o outro ponteiro que o
			// elemento em questão seja maior que o pivô
			while (j >= i && vetor[j] > pivo)
			{
				j--;
			}

			// Caso os ponteiros ainda nao tenham se cruzado, significa que
			// valores menores e maiores que o pivô foram localizados em ambos
			// os lados. Trocar estes elementos de lado
			if (i < j)
			{
				trocar(vetor, j, i);
				i++;
				j--;
			}
		}

		trocar(vetor, inicio, j);
		return j;
	}

	/** Troca dois elementos de um vetor */
	private void trocar(int[] vetor, int i, int j)
	{
		int temp = vetor[i];
		vetor[i] = vetor[j];
		vetor[j] = temp;
	}
}
