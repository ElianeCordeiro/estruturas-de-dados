package listaDuplamenteEncadeada;

public class No {

		private int info;
		private No prox;
		private No ant;
		
		public No(int info) {
			this.info = info;
			this.prox = null;
			this.ant = null;
		}

		public No(int info, No prox) {
			this.info = info;
			this.prox = prox;
			this.ant = null;
		}

		public int getInfo() {
			return info;
		}

		public void setInfo(int info) {
			this.info = info;
		}

		public No getProx() {
			return prox;
		}

		public void setProx(No prox) {
			this.prox = prox;
		}

		public No getAnt() {
			return ant;
		}

		public void setAnt(No ant) {
			this.ant = ant;
		}
		
		
		
		
}
