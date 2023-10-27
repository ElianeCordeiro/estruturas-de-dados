package arvoreavl;

public class MainAvl {

	public static void main(String[] args) {

		ArvoreAvl arvore = new ArvoreAvl();
		
		// 1) INSERÇÃO SIMPLES QUE NÃO REQUER BALANCEAMENTO
		
		arvore.inserir(1);
		arvore.inserir(2);
		arvore.inserir(3);
		arvore.inserir(4);
		arvore.inserir(5);
		
		System.out.println("Pre-ordem");
		arvore.preOrdem();
		
		// 2) REMOÇÃO DE NÓ SEM FILHOS
		arvore.remover(4);
		System.out.println("Pre-ordem");
		arvore.preOrdem();
		
		// 3) REMOÇÃO DE NÓ COM 1 FILHO À DIREITA
		arvore.remover(3);
		System.out.println("Pre-ordem");
		arvore.preOrdem();		
		
		// 4) REMOÇÃO DE NÓ COM 1 FILHO À ESQUERDA
		arvore.inserir(6);
		arvore.remover(5);
		System.out.println("Pre-ordem");
		arvore.preOrdem();	
		
		// 5) REMOÇÃO DE NÓ COM 2 FILHOS, E QUE SEJA UM FILHO À DIREITA
		arvore.inserir(5);
		arvore.inserir(7);
		arvore.remover(6);
		System.out.println("Pre-ordem");
		arvore.preOrdem();
		
		
		
		// 6) REMOÇÃO DE NÓ COM 2 FILHOS, E QUE SEJA UM FILHO À ESQUERDA
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
