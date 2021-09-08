package quick;

public class Test
{
	public static void main(String[] args)
	{
		int vetor[] = new int[10000];
		// preenche o vetor com valores aleatórios até 100.000
		for (int i = 0; i < vetor.length; i++)
		{
			vetor[i] = (int) (Math.random() * 100000);
		}
		System.out.println("Vetor desordenado:");
		imprimirVetor(vetor);
		Quick quick = new Quick();
		long tempoInicial = System.currentTimeMillis();
		quick.ordenarVetorDeInteiros(vetor);
		long tempoFinal = System.currentTimeMillis();
		System.out.println("\nExecutado em = " + (tempoFinal - tempoInicial) + " ms");
		System.out.println("Vetor ordenado com Quicksort:");
		imprimirVetor(vetor);
	}

	private static void imprimirVetor(int[] vetor)
	{
		for (int num : vetor)
		{
			System.out.print(num + ", ");
		}
	}
}
