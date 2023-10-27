package listaDuplamenteEncadeada;

public class Lista {

	private No refInicio;
	private No refFim;
	private int tamanho;

	public Lista() {
		this.refInicio = null;
		this.refFim = null;
		this.tamanho = 0;
	}

	public boolean listaVazia() {
		return this.tamanho == 0;
	}

	public void inserir(int info) {

		No novoNo = new No(info, refInicio);

		if (listaVazia()) {
			refInicio = novoNo;
			refFim = novoNo;
		} else {

			No aux = refInicio;

			while (aux != null && novoNo.getInfo() > aux.getInfo()) {
				aux = aux.getProx();
			}

			if (aux == refInicio) {
				novoNo.setProx(refInicio);
				novoNo.setAnt(null);
				refInicio.setAnt(novoNo);
				refInicio = novoNo;

			} else if (aux == null) {
				refFim.setProx(novoNo);
				novoNo.setAnt(refFim);
				refFim = novoNo;
				refFim.setProx(null);

			} else {
				novoNo.setProx(aux);
				aux.getAnt().setProx(novoNo);
				novoNo.setAnt(aux.getAnt());
				aux.setAnt(novoNo);
			}

		}
		this.tamanho++;
	}

	public void remover(int info) {

		int contadorElementos = this.tamanho;

		if (listaVazia()) {
			System.out.println("Lista vazia. Não é possível remover");
			return;
		}

		for (No aux = refInicio; aux != null; aux = aux.getProx()) {

			if (aux.getInfo() == info) {

				if (aux.getAnt() != null && aux.getProx() != null) {
					aux.getAnt().setProx(aux.getProx());
					aux.getProx().setAnt(aux.getAnt());

					contadorElementos--;

				} else if (aux.getAnt() == null) {
					
					if (aux.getProx() == null) {
						refInicio = null;
						refFim = null;
						this.tamanho = 0;
						return;
					}
					aux.getProx().setAnt(null);
					refInicio = aux.getProx();

					contadorElementos--;
				} else if (aux.getProx() == null) {
					aux.getAnt().setProx(null);
					refFim = aux.getAnt();

					contadorElementos--;
				}

			}
		}
		if (contadorElementos == this.tamanho && contadorElementos != 0) {
			System.out.println("Elemento inexistente.\n");
		}

	}

	public void imprimir() {
		if (listaVazia()) {
			System.out.println("Lista vazia");
			return;
		}

		for (No aux = refInicio; aux != null; aux = aux.getProx()) {
			System.out.println(aux.getInfo() + " ");
		}
		System.out.println("");

		for (No aux = refFim; aux != null; aux = aux.getAnt()) {
			System.out.println(aux.getInfo() + " ");
		}
		System.out.println("");
	}

}
