package fila;

public class Main {

	public static void main(String[] args) {

		ListaFila l = new ListaFila();
		
		l.enqueue("a");
		l.print();
		l.enqueue("b");
		l.print();
		l.enqueue("c");
		l.print();
		
		
		l.dequeue();
		l.print();
		l.dequeue();
		l.print();
		l.dequeue();
		l.print();
	}

}
