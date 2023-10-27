package listaDuplamenteEncadeada;

public class Main {

	public static void main(String[] args) {

		Lista l = new Lista();
		
		
		//inserir elementos 
		l.inserir(1);
		l.inserir(2);
		l.inserir(3);
		
		//imprimir elementos do inicio ao fim e do fim ao inicio
		System.out.println("Lista completa:  ");
		l.imprimir();

// a) remover elemento do inicio
		l.remover(1);
		//imprimir lista sem elemento removido
		System.out.println("Lista sem o primeiro elemento: ");
		l.imprimir();
		
		l.inserir(1);
// b) remover elemento do meio
		l.remover(2);
		System.out.println("Lista sem o elemento do meio: ");
		l.imprimir();

		l.inserir(2);
// c) remover elemento do fim
		l.remover(3);
		System.out.println("Lista sem o último elemento");
		l.imprimir();
		
		//lista inicial
		l.inserir(3);
		
		
		//remover elementos duplicados
		l.inserir(1);
		//lista com duplicados
		l.imprimir();
// d) remocao de elementos que possuem copias
		l.remover(1);
		System.out.println("Sem cópias: ");
		l.imprimir();
		
		//lista inicial
		l.inserir(1);
		
// e) remover elemento inexistentes
		l.remover(4);
		
// f) imprimir lista vazia
		
		//lista atual
		System.out.println("Lista atual: ");
		l.imprimir();
		l.remover(1);
		l.remover(2);
		l.remover(3);
		
		//imprimir lista vazia
		l.imprimir();
		
// g) esvaziar e voltar a preenche-la
		System.out.println("Lista repreenchida após ser esvaziada: ");
		l.inserir(4);
		l.inserir(6);
		l.inserir(5);
		l.inserir(7);
		
		l.imprimir();
	
	
	}

}
