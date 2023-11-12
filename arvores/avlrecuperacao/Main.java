package avlrecuperacao;

public class Main {
	
	public static void main(String[] args) {
		
//		//1. INsercao simples que nao requer balanceamento
		AVL arvore = new AVL(10);
		arvore.insere(5);
		arvore.insere(16);
		arvore.insere(1);
		arvore.insere(12);
		arvore.insere(20);
		System.out.println("Impressão pre ordem: " + arvore.preOrdem());
			
//		//2. remocao de no sem filhos
//		AVL arvore = new AVL(10);
//		arvore.insere(5);
//		arvore.insere(16);
//		arvore.insere(1);
//		arvore.insere(12);
//		arvore.insere(20);
//		arvore.remove(12);
//		System.out.println("Impressão pre ordem: " + arvore.preOrdem());
		
//		//3. remocao de no com 1 filho à direita
//		AVL arvore = new AVL(10);
//		arvore.insere(5);
//		arvore.insere(16);
//		arvore.insere(7);
//		arvore.insere(12);
//		arvore.insere(20);
//		arvore.remove(5);
//		System.out.println("Impressão pre ordem: " + arvore.preOrdem());
		
//		//4. remocao de no com 1 filho a esquerda
//		AVL arvore = new AVL(10);
//		arvore.insere(5);
//		arvore.insere(16);
//		arvore.insere(1);
//		arvore.insere(12);
//		arvore.insere(20);
//		arvore.remove(5);
//		System.out.println("Impressão pre ordem: " + arvore.preOrdem());
		
//		//5. remocoa de no com 2 filhos e que seja um filho a direita
//		AVL arvore = new AVL(10);
//		arvore.insere(5);
//		arvore.insere(16);
//		arvore.insere(1);
//		arvore.insere(12);
//		arvore.insere(20);
//		arvore.remove(16);
//		System.out.println("Impressão pre ordem: " + arvore.preOrdem());
		
//		//6. remocoa de no com 2 filhos e que seja um filho a esquerda
//				AVL arvore = new AVL(10);
//				arvore.insere(5);
//				arvore.insere(16);
//				arvore.insere(1);
//				arvore.insere(7);
//				arvore.insere(12);
//				arvore.insere(20);
//				arvore.insere(6);
//				arvore.remove(5);
//				System.out.println("Impressão pre ordem: " + arvore.preOrdem());
		
//		//7. insercao que requer remocao simples a direita
//				AVL arvore = new AVL(10);
//				arvore.insere(5);
//				arvore.insere(16);
//				arvore.insere(1);
//				arvore.insere(12);
//				arvore.insere(20);
//				arvore.insere(0);
//				System.out.println("Impressão pre ordem: " + arvore.preOrdem());
		
//		//8. insercao que requer remocao simples a direita
//				AVL arvore = new AVL(10);
//				arvore.insere(5);
//				arvore.insere(16);
//				arvore.insere(1);
//				arvore.insere(8);
//				arvore.insere(12);
//				arvore.insere(11);
//				System.out.println("Impressão pre ordem: " + arvore.preOrdem());
		
		//9. insercao que requer rotacao simples a esquerda
//			AVL arvore = new AVL(10);
//			arvore.insere(5);
//			arvore.insere(16);
//			arvore.insere(1);
//			arvore.insere(8);
//			arvore.insere(20);
//			arvore.insere(22);
//			System.out.println("Impressão pre ordem: " + arvore.preOrdem());	
		
		//10. insercao que requer rotacao simples a esquerda
//		AVL arvore = new AVL(10);
//		arvore.insere(5);
//		arvore.insere(12);
//		arvore.insere(8);
//		arvore.insere(11);
//		arvore.insere(16);
//		arvore.insere(9);
//		System.out.println("Impressão pre ordem: " + arvore.preOrdem());	
		
//		//11. insercao que requer rotacao dupla a direita
//		AVL arvore = new AVL(10);
//		arvore.insere(5);
//		arvore.insere(15);
//		arvore.insere(1);
//		arvore.insere(7);
//		arvore.insere(12);
//		arvore.insere(20);
//		arvore.insere(-2);
//		arvore.insere(3);
//		arvore.insere(2);
//		System.out.println("Impressão pre ordem: " + arvore.preOrdem());	
		
		//12. insercao que requer rotacao dupla a esquerda
//		AVL arvore = new AVL(10);
//		arvore.insere(5);
//		arvore.insere(15);
//		arvore.insere(1);
//		arvore.insere(7);
//		arvore.insere(12);
//		arvore.insere(20);
//		arvore.insere(17);
//		arvore.insere(18);
//		System.out.println("Impressão pre ordem: " + arvore.preOrdem());
		
		//13. remocao que requer balanceamento (rotacao simples direita)
//		AVL arvore = new AVL(10);
//		arvore.insere(5);
//		arvore.insere(16);
//		arvore.insere(1);
//		arvore.insere(7);
//		arvore.insere(20);
//		arvore.remove(16);
//		arvore.remove(20);
//		System.out.println("Impressão pre ordem: " + arvore.preOrdem());
		
//		//14. remocao que requer balanceamento (rotacao simples esquerda)
//		AVL arvore = new AVL(10);
//		arvore.insere(5);
//		arvore.insere(16);
//		arvore.insere(1);
//		arvore.insere(7);
//		arvore.insere(20);
//		arvore.insere(9);
//		arvore.remove(1);
//		System.out.println("Impressão pre ordem: " + arvore.preOrdem());
		
		//15. insercao que requer balanceamento seguido de remocao que tambem requer balanceamento
//		AVL arvore = new AVL(10);
//		arvore.insere(5);
//		arvore.insere(16);
//		arvore.insere(1);
//		arvore.insere(7);
//		arvore.insere(13);
//		arvore.insere(20);
//		arvore.insere(8);
//		arvore.insere(22);
//		arvore.insere(9);
//		arvore.remove(1);
//		System.out.println("Impressão pre ordem: " + arvore.preOrdem());
		
		//16. insercao que requer balanceamento seguidode remocao que tambem requer balanceamento
//		AVL arvore = new AVL(10);
//		arvore.insere(5);
//		arvore.insere(16);
//		arvore.insere(1);
//		arvore.insere(7);
//		arvore.insere(13);
//		arvore.insere(20);
//		arvore.insere(8);
//		arvore.insere(18);
//		arvore.insere(19);
//		arvore.remove(13);
//		System.out.println("Impressão pre ordem: " + arvore.preOrdem());
		
		//17. esvaziar AVL e reinserir elementos
//		AVL arvore = new AVL(10);
//		arvore.insere(5);
//		arvore.insere(16);
//		arvore.remove(10);
//		arvore.remove(5);
//		arvore.remove(16);
//		arvore.insere(100);
//		arvore.insere(50);
//		arvore.insere(150);
//		System.out.println("Impressão pre ordem: " + arvore.preOrdem());
		
		//18. esvaziar avl e reinserir elementos
//		AVL arvore = new AVL(10);
//		arvore.insere(5);
//		arvore.insere(16);
//		arvore.remove(10);
//		arvore.remove(5);
//		arvore.remove(16);
//		arvore.insere(100);
//		arvore.insere(50);
//		arvore.insere(1);
//		System.out.println("Impressão pre ordem: " + arvore.preOrdem());
		
//		//19. remocao que requer balanceamento (rotacao simples direita)
//		AVL arvore = new AVL(10);
//		arvore.insere(5);
//		arvore.insere(16);
//		arvore.insere(1);
//		arvore.insere(7);
//		arvore.insere(12);
//		arvore.insere(20);
//		arvore.insere(8);
//		arvore.insere(11);
//		arvore.insere(14);
//		arvore.insere(17);
//		arvore.insere(22);
//		arvore.insere(15);
//		arvore.remove(8);
//		System.out.println("Impressão pre ordem: " + arvore.preOrdem());
		
		//20. remocao que requer balanceamento (rotacao simples direita)
//		AVL arvore = new AVL(10);
//		arvore.insere(5);
//		arvore.insere(16);
//		arvore.insere(1);
//		arvore.insere(7);
//		arvore.insere(12);
//		arvore.insere(20);
//		arvore.insere(8);
//		arvore.insere(11);
//		arvore.insere(14);
//		arvore.insere(17);
//		arvore.insere(22);
//		arvore.insere(15);
//		arvore.remove(8);	
//		arvore.remove(12);
//		arvore.remove(15);
//		System.out.println("Impressão pre ordem: " + arvore.preOrdem());
	}
}
