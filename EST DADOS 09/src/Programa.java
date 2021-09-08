import java.util.Random;

public class Programa
{
	public static void main(String[] args)
	{
		int[] vetor = new int[5000];
		Random r = new Random();
		for (int i = 0; i < 5000; i++)
		{
			vetor[i] = r.nextInt();
		}
		System.out.println(vetor.length);
		
//		int vetor[] = { 3, 5, 4, 1, 9, 6, 7, 2 };

		System.out.println("Vetor Antes: ");
		for (int i = 0; i < vetor.length; i++)
		{
			System.out.println(vetor[i]);
		}

		new BubbleSort().ordenar(vetor);

		System.out.println("\n\nVetor Depois: ");
		for (int i = 0; i < vetor.length; i++)
		{
			System.out.println(vetor[i]);
		}
	}
}
