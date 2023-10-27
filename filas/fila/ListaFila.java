package fila;

public class ListaFila {

	private NoFila inicio;
	private NoFila fim;
	
	public ListaFila() {
		this.inicio = null;
		this.fim = null;
	}
	
	
	public boolean listaVazia() {
		return this.inicio == null;
	}
	
	public void enqueue(String info) {
		
		NoFila novoNo = new NoFila(info);
		
		if(listaVazia()) {
			fim = novoNo;
			inicio = novoNo;
			
			return;
		}
		
		novoNo.setAnt(fim);
		fim.setProx(novoNo);
		fim = novoNo;
	}
	
	public void print() {
		
		for(NoFila aux = inicio; aux != null; aux = aux.getProx()) {
			System.out.println(aux.getInfo() + " ");
		}
		System.out.println("");
	}
	
	public void dequeue() {
		
		if(listaVazia()) {
			System.out.println("Lista vazia. Impossível remover.");
			return;
		}
		
		inicio = inicio.getProx();
		if(inicio != null) {
			inicio.setAnt(null);
		} else {
			System.out.println("Fila vazia.");
			return;
		}
	}
	
	
	
	
	
}
