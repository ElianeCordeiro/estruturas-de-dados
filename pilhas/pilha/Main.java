package pilha;

public class Main {

	public static void main(String[] args) {

		Pilha l = new Pilha();
		
		l.push("a");
		l.imprimir();
		l.push("b");
		l.imprimir();
		l.pop();
		l.imprimir();
		l.pop();
		l.imprimir();
	}

}
