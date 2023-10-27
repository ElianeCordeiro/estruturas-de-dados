package arvorebst;

public class Folha {

	private int valor;
	private Folha esquerda;
	private Folha direita;
	
	
	public Folha(int valor) {
		super();
		this.valor = valor;
		this.esquerda = null;
		this.direita = null;
	}
	
	
	public int getValor() {
		return valor;
	}
	public void setValor(int valor) {
		this.valor = valor;
	}
	public Folha getEsquerda() {
		return esquerda;
	}
	public void setEsquerda(Folha esquerda) {
		this.esquerda = esquerda;
	}
	public Folha getDireita() {
		return direita;
	}
	public void setDireita(Folha direita) {
		this.direita = direita;
	}
	
	
}
