package arvoreavl;

public class Folha {
    private int valor;
    private Folha esquerda;
    private Folha direita;
    private int altura;

    public Folha(int valor) {
        this.valor = valor;
        this.esquerda = null;
        this.direita = null;
        this.altura = 1; // Inicialmente, a altura é 1 para a nova folha.
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


	public void setAltura(int altura) {
		this.altura = altura;
	}


	public int getAltura() {
        return altura;
    }

    public int getFatorBalanceamento() {
        int alturaEsquerda = (esquerda != null) ? esquerda.getAltura() : 0;
        int alturaDireita = (direita != null) ? direita.getAltura() : 0;
        return alturaEsquerda - alturaDireita;
    }

    public void atualizarAltura() {
        int alturaEsquerda = (esquerda != null) ? esquerda.getAltura() : 0;
        int alturaDireita = (direita != null) ? direita.getAltura() : 0;
        altura = 1 + Math.max(alturaEsquerda, alturaDireita);
    }
}
