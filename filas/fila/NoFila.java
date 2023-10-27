package fila;

public class NoFila {

	private String info;
	private NoFila ant;
	private NoFila prox;
	
	public NoFila(String info) {
		this.info = info;
		this.ant = null;
		this.prox = null;
	}

	public String getInfo() {
		return info;
	}

	public void setInfo(String info) {
		this.info = info;
	}

	public NoFila getAnt() {
		return ant;
	}

	public void setAnt(NoFila ant) {
		this.ant = ant;
	}

	public NoFila getProx() {
		return prox;
	}

	public void setProx(NoFila prox) {
		this.prox = prox;
	}
	
	
	
}
