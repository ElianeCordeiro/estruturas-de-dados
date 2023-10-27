package listaencadeada1;

public class Lista {

	private No ref;
	
	//lista vazia
	public Lista() {
		this.ref = null;
	}
	
	//inserir
	public void inserir(String info) {
		No novoNo = new No(info, ref);
		//ref so aponta para o no que acabou de inserir -para casos em que se insere no inicio da lista
		ref = novoNo; 
	}
	
	
	//testa se a lista é vazia
	public boolean listaVazia() {
		return ref == null;
	}
	
	//imprimir
	public void imprimir() {
		if(listaVazia()) {
			System.out.println("Lista vazia");
			return;
		}
		
		for(No aux = ref; aux != null; aux = aux.getProx()) {
			System.out.println(aux.getInfo() + " ");
		}
		System.out.println("");
	}
	//remover
	public void remover(String info) {
		if(listaVazia()) {
			System.out.println("Lista vazia");
			return;
		}
		
		No ant = null;
		No prox;
		
		for(prox = ref; prox!= null; prox = prox.getProx()) {
			 if (info.equals(prox.getInfo())) {
				 if(ant == null) {
					 ref = prox.getProx();
				 } else {
					 ant.setProx(prox.getProx());
				 }
			 } else {
				 ant = prox;
			 }
		}
		
		
	}
	
}
