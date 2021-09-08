
public class Programa
{
	public static void main(String[] args)
	{
		ListaEncadeada<Aluno> lista = new ListaEncadeada<>();
		
		Aluno aluno1 = new Aluno(1001, "José");
		Aluno aluno2 = new Aluno(1002, "Joana");
		Aluno aluno3 = new Aluno(1003, "João");
		Aluno aluno4 = new Aluno(1004, "Joaquim");

		lista.inserir(aluno1);
		lista.inserir(aluno2);
		lista.inserir(aluno3);
		lista.inserir(aluno4);

		for (int i = 0; i < lista.getTamanho(); i++)
		{
			Aluno a = lista.consultar(i);
			System.out.println(a.getNome());
		}
		
		System.out.println("----- Removendo... -----");
		lista.remover(aluno2);
		for (int i = 0; i < lista.getTamanho(); i++)
		{
			Aluno a = lista.consultar(i);
			System.out.println(a.getNome());
		}
	}
}
