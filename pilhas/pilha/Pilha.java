package pilha;

public class Pilha {

	private No topo;

	public Pilha() {
		this.topo = null;
	}
	
	
	public boolean listaVazia() {
		return topo == null;
	} 
	
	public void push(String info) {
		
		No novoNo = new No(info);
		
		if(listaVazia()) {
			topo = novoNo;
		} 
		else {
			novoNo.setProx(topo);
			topo = novoNo;
		}
	}
	
	public void imprimir() {
		
		if(listaVazia()) {
			System.out.println("Impossível remover. Pilha vazia");
			return;
		}
		
		for(No aux = topo; aux != null; aux = aux.getProx()) {
			System.out.println(aux.getInfo() + "");
			
		}
		System.out.println("");
	}
	
	public void pop() {
		
		if(listaVazia()) {
			System.out.println("Impossível remover. Lista vazia");
			return;
		}
		
		topo = topo.getProx();
		
	}
	
}
