package shell;

public class Shell
{
	public void ordenar(int[] vetor)
	{
		int h = 1; // 1 -> 4 -> 13 -> 4
		int n = vetor.length; // 8

		// divisão em h posições
		while (h < n)
		{
			h = h * 3 + 1;
		}
		h = h / 3;
		
		int c, j;

		// troca de posições e reduções no h
		while (h > 0)
		{
			for (int i = h; i < n; i++)
			{
				c = vetor[i];
				j = i;
				while (j >= h && vetor[j - h] > c)
				{
					vetor[j] = vetor[j - h];
					j = j - h;
				}
				vetor[j] = c;
			}
			h = h / 2;
		}
	}
}
