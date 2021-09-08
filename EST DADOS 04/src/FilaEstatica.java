@SuppressWarnings("unchecked")
public class FilaEstatica <T> {
	
	private int inicio = 0;
	private int fim = 0;
	private int tamanhoAtual = 0;
	private Object dados[];
	
	// construtor da fila estática
	public FilaEstatica(int capacidade) {
		dados = new Object[capacidade];
	}
	
	public boolean isCheia() {
		return tamanhoAtual == dados.length;
	}
	
	public boolean isVazia() {
		return tamanhoAtual == 0;
	}
	
	public boolean inserir(T t) {
		if(isCheia())
			return false;
		dados[fim] = t;
		fim = (fim + 1) % dados.length;
		tamanhoAtual++;
		return true;
	}
	
	public T remover() {
		if(isVazia())
			return null;
		T t = (T) dados[inicio];
		inicio = (inicio + 1) % dados.length;
		tamanhoAtual--;
		return t;
	}
	
	public T get() {
		if(isVazia())
			return null;
		T t = (T) dados[inicio];
		return t;
	}
	
}
