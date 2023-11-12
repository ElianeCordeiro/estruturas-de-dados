package avlrecuperacao;

public class No {



	int info;

	No esquerda;

	No direita;

	int altura;



	public No(int info) {

	    this.info = info;

	    this.esquerda = null;

	    this.direita = null;

	    this.altura = 1;

	}



	public int getInfo() {

		return info;

	}



	public void setInfo(int info) {

		this.info = info;

	}



	public No getEsquerda() {

		return esquerda;

	}



	public void setEsquerda(No esquerda) {

		this.esquerda = esquerda;

	}



	public No getDireita() {

		return direita;

	}



	public void setDireita(No direita) {

		this.direita = direita;

	}



	public int getAltura() {

		return altura;

	}



	public void setAltura(int altura) {

		this.altura = altura;

	}



}


