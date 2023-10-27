package arvorebst;

public class Arvore {
	
	private Folha raiz;

	public Arvore() {
		this.raiz = null;
	}
	
	
	public void inserir(int valor) {
		
		inserir(raiz, valor);
	}
	
	public void inserir(Folha folha, int valor) {
		
		if(folha == null) {
			raiz = new Folha(valor);
			
		} else {
			if(valor < folha.getValor()) {
				if(folha.getEsquerda() != null) {
					inserir(folha.getEsquerda(), valor);
				
				} else {
					System.out.println("Inserindo " + valor + " a esquerda de " + folha.getValor());
					folha.setEsquerda(new Folha(valor));
				
				}
			
			} else {
				if (folha.getDireita() != null) {
					inserir(folha.getDireita(), valor);
				
				} else {
					System.out.println("Inserindo " +  valor + " a direita de " +folha.getValor());
					folha.setDireita(new Folha(valor));
				}
			}
		}
	
	}
	
	public Folha getRaiz() {
		return raiz;
	}


	public void emOrdem(Folha atual){
		if(atual!= null) {
			emOrdem(atual.getEsquerda());
			System.out.println(atual.getValor());
			emOrdem(atual.getDireita());
		}
	}
	
	public void preOrdem(Folha atual) {
		if(atual != null) {
			System.out.println(atual.getValor());
			preOrdem(atual.getEsquerda());
			preOrdem(atual.getDireita());
		}
	}
	
	public void posOrdem(Folha atual) {
		if(atual != null) {
			posOrdem(atual.getEsquerda());
			posOrdem(atual.getDireita());
			System.out.println(atual.getValor());
		}
	}
	
	
	public boolean remover (int valor) {
		
		//buscar o elemento na árvore
		Folha atual = this.raiz;
		Folha paiAtual = null;
		
		while(atual != null) {
			if(atual.getValor() == valor) {
				break;
			} else if (valor < atual.getValor()) {
				paiAtual = atual;
				atual = atual.getEsquerda();
			} else {
				paiAtual = atual;
				atual = atual.getDireita();
			}
		}
		
		if (atual != null) {
			
			//elemento tem 2 filhos ou elemento tem somente filho à direita
			
			if (atual.getDireita() != null) {
				
				Folha substituto = atual.getDireita();
				Folha paiSubstituto = atual;
				while(substituto.getEsquerda() != null) {
					paiSubstituto = substituto;
					substituto = substituto.getEsquerda();
				}
				substituto.setEsquerda(atual.getEsquerda());
				if (paiAtual != null) {
					if (atual.getValor() < paiAtual.getValor()) { //atual < paiAtual
						paiAtual.setEsquerda(substituto);
					} else {
						paiAtual.setDireita(substituto);
					}
				} else {  // se não tem paiAtual, então é a raiz
					this.raiz = substituto;
					paiSubstituto.setEsquerda(null);
					this.raiz.setDireita(paiSubstituto);
					this.raiz.setEsquerda(atual.getEsquerda());
				}
				
				
				//removeu o elemento da árvore
				if(substituto.getValor() < paiSubstituto.getValor()) {
					paiSubstituto.setEsquerda(null);
				} else {
					paiSubstituto.setDireita(null);
				}
			
			} else if (atual.getEsquerda() != null) { //tem filho só à esquerda
				Folha substituto = atual.getEsquerda();
				Folha paiSubstituto = atual;
				while(substituto.getDireita() != null) {
					paiSubstituto = substituto;
					substituto = substituto.getDireita();
				}
				
				if(paiAtual != null) {
					if (atual.getValor() < paiAtual.getValor()) { //atual < paiAtual
						paiAtual.setEsquerda(substituto);
					} else {
						paiAtual.setEsquerda(substituto);
					}
				} else { // se for a raiz 
					this.raiz = substituto;
				}
				
				//removeu o elemento da árvore
				if(substituto.getValor() < paiSubstituto.getValor()) { //substituto < paiSubstituto
					paiSubstituto.setEsquerda(null);
				} else {
					paiSubstituto.setDireita(null);
				}
			} else { //não tem filho
				if(paiAtual != null) {
					if(atual.getValor() < paiAtual.getValor()) { //atual < paiAtual
						paiAtual.setEsquerda(null);
					} else {
						paiAtual.setDireita(null);
					}
				} else {
					 // é a raiz
					this.raiz = null;
				}
			}
			return true;
		} else {
			return false;
		}
	}
	
}
