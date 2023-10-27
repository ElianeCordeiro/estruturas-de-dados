package doubleLinkedList;

public class Linked {

	private Node ref;
	private int tamanho;

	public Linked() {
		this.ref = null;
	}

	public boolean emptyList() {
		return tamanho == 0;
	}

	public void insert(int info) {

		Node novoNo = new Node(info);

		if (emptyList()) {
			ref = novoNo;
			tamanho++;
			return;
		}

		Node aux = ref;

		while (aux != null && novoNo.getInfo() > aux.getInfo()) {

			if (aux.getNext() == null) {
				break;
			}
			aux = aux.getNext();
		}

		if (aux == ref) {

			if (novoNo.getInfo() > ref.getInfo()) {
				novoNo.setBefore(ref);
				novoNo.setNext(null);
				ref.setNext(novoNo);
			} 
			// novoNo.getInfo() < ref.getInfo()
			else if(novoNo.getInfo() < ref.getInfo()){
				novoNo.setBefore(null);
				novoNo.setNext(ref);
				ref.setBefore(novoNo);
			}
			
			else if (novoNo.getInfo() == ref.getInfo()) {
				novoNo.setBefore(ref);
				ref.setNext(novoNo);
				novoNo.setNext(null);
			}
		}

		else if (aux.getNext() == null) {

			if (aux.getInfo() > novoNo.getInfo()) {
				novoNo.setNext(aux);
				novoNo.setBefore(aux.getBefore());
				aux.getBefore().setNext(novoNo);
			} else if (aux.getInfo() < novoNo.getInfo()) {
				novoNo.setNext(null);
				novoNo.setBefore(aux);
				aux.setNext(novoNo);
			}
		}

		else {
			novoNo.setNext(aux);
			novoNo.setBefore(aux.getBefore());
			novoNo.getBefore().setNext(novoNo);
			aux.setBefore(novoNo);
		}

		tamanho++;
	}

	public void print() {

		if (emptyList()) {
			System.out.println("Empty linked list!");
			return;
		}

		for (Node aux = ref; aux != null; aux = aux.getNext()) {
			System.out.print(aux.getInfo() + " ");
		}
		System.out.println("");
	}

}