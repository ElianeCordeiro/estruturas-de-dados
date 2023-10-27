package arvorebst;

public class Main {

	public static void main(String[] args) {

		Arvore arvore = new Arvore();
		
		// 1) inserções simples
		arvore.inserir(11);
		arvore.inserir(8);
		arvore.inserir(5);
		arvore.inserir(9);
		arvore.inserir(7);
		arvore.inserir(18);
		arvore.inserir(13);
		arvore.inserir(20);
		arvore.inserir(10);
		arvore.inserir(3);
		
		System.out.println("Pre-ordem:");
		arvore.preOrdem(arvore.getRaiz());

		
		// 2) remoção de nó sem filhos
		arvore.remover(7);
		System.out.println("Pre-ordem:");
		arvore.preOrdem(arvore.getRaiz());
		
		// 3) remoção de nó com 1 filho à direita
		arvore.remover(9);
		System.out.println("Pre-ordem:");
		arvore.preOrdem(arvore.getRaiz());
		
		// 4) remoção de nó com 1 filho à esquerda 
		arvore.remover(5);
		System.out.println("Pre-ordem:");
		arvore.preOrdem(arvore.getRaiz());
		
		// 5) remoção de nó com 2 filhos , e que seja um nó à direita
		arvore.remover(18);
		System.out.println("Pre-ordem:");
		arvore.preOrdem(arvore.getRaiz());
		
		
		// 6) remoção de nó com 2 filhos, e que seja um nó à esquerda
		arvore.remover(8);
		System.out.println("Pre-ordem:");
		arvore.preOrdem(arvore.getRaiz());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
