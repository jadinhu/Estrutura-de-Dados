
public class BubbleSort
{
	public void ordenar(int[] v)
	{
		int i, aux, fim = v.length - 1;
		do
		{
			for (i = 0; i < fim; i++)
			{
				if (v[i] > v[i + 1])
				{
					aux = v[i];
					v[i] = v[i + 1];
					v[i + 1] = aux;
				}
			}
			fim--;
		} while (i != 0);
	}
}
