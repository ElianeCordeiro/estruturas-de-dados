package listaencadeada1;

public class No {
	
	private String info;
	private No prox;
	
	public No(String info) {
		this.info = info;
		//para situacoes em que o No aponte para null (ultimo elemento da lista/ lista vazia)
		this.prox = null;
	}

	public No(String info, No prox) {
		this.info = info;
		this.prox = prox;
	}
	
	
	public String getInfo() {
		return info;
	}
	public void setInfo(String info) {
		this.info = info;
	}
	public No getProx() {
		return prox;
	}
	public void setProx(No prox) {
		this.prox = prox;
	}
	
	
}
