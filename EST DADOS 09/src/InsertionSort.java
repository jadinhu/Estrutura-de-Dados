
public class InsertionSort
{
	public void ordenar(int[] v)
	{
		int i, j, aux;
		for (i = 1; i < v.length; i++)
		{
			aux = v[i];
			for (j = i; (j > 0) && (aux < v[j - 1]); j--)
			{
				v[j] = v[j - 1];
			}
			v[j] = aux;
		}
	}
}
