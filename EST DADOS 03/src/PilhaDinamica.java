
public class PilhaDinamica <T> {

	private No topo;
	private int tamanho;
	
	public boolean isVazia() {
		return tamanho == 0 ? true : false;
	}
	
	public int getTamanho() {
		return tamanho;
	}
	
	public void inserir(T elemento) {
		No no = new No(); // cria um elemento que encapsulará o T
		no.elemento = elemento;
		no.proximo = topo;
		topo = no;
		tamanho++;
	}
	
	public boolean remover() {
		if(isVazia())
			return false;
		topo = topo.proximo;
		tamanho--;
		return true;
		// topo é removido da memória pelo Garbage Collector
	}
	
	public T get() {
		return isVazia() ? null : topo.elemento;
	}
	
	public T pop() {
		if(isVazia())
			return null;
		No no = topo;
		topo = topo.proximo;
		tamanho--;
		return no.elemento;
	}
	
	private class No {
		No proximo;
		T elemento;
	}
}