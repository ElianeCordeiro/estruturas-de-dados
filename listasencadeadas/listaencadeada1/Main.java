package listaencadeada1;

public class Main {

	public static void main(String[] args) {

		Lista l = new Lista();
		l.inserir("a");
		l.inserir("b");
		l.inserir("c");

		l.imprimir();
		
		
		l.remover("c");
		l.imprimir();
		
		l.listaVazia();
		
		
//		No no3 = new No("3");
//
//		No no2 = new No("2", no3);
//
//		No no1 = new No("1", no2);
//		
//		for (No p = no1; p != null; p = p.getProx()) {
//			System.out.println(p.getInfo());
//		}
		
	}

}
