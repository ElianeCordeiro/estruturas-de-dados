package arvoreavl;

public class ArvoreAvl {

	    private Folha raiz;

	    public ArvoreAvl() {
	        this.raiz = null;
	    }

	    public void inserir(int valor) {
	        raiz = inserir(raiz, valor);
	    }

	    private Folha inserir(Folha folha, int valor) {
	        if (folha == null) {
	            return new Folha(valor);
	        }

	        if (valor < folha.getValor()) {
	            folha.setEsquerda(inserir(folha.getEsquerda(), valor));
	        } else {
	            folha.setDireita(inserir(folha.getDireita(), valor));
	        }

	        // Atualizar a altura e o fator de balanceamento
	        folha.atualizarAltura();
	        int fatorBalanceamento = folha.getFatorBalanceamento();

	        // Realizar rotações para manter o equilíbrio
	        if (fatorBalanceamento > 1) {
	            if (valor < folha.getEsquerda().getValor()) {
	                return rotacaoDireita(folha);
	            } else {
	                folha.setEsquerda(rotacaoEsquerda(folha.getEsquerda()));
	                return rotacaoDireita(folha);
	            }
	        }

	        if (fatorBalanceamento < -1) {
	            if (valor > folha.getDireita().getValor()) {
	                return rotacaoEsquerda(folha);
	            } else {
	                folha.setDireita(rotacaoDireita(folha.getDireita()));
	                return rotacaoEsquerda(folha);
	            }
	        }

	        return folha;
	    }

	    private Folha rotacaoEsquerda(Folha folhaDeRotacao) {
	        Folha filhoDireitaFolhaDeRotacao = folhaDeRotacao.getDireita();
	        Folha netoFolhaDeRotacao = filhoDireitaFolhaDeRotacao.getEsquerda();

	        filhoDireitaFolhaDeRotacao.setEsquerda(folhaDeRotacao);
	        folhaDeRotacao.setDireita(netoFolhaDeRotacao);

	        folhaDeRotacao.atualizarAltura();
	        filhoDireitaFolhaDeRotacao.atualizarAltura();

	        return filhoDireitaFolhaDeRotacao;
	    }

	    private Folha rotacaoDireita(Folha folhaDeRotacao) {
	        Folha filhoEsquerdaFolhaDeRotacao = folhaDeRotacao.getEsquerda();
	        Folha netoFolhaDeRotacao = filhoEsquerdaFolhaDeRotacao.getDireita();

	        filhoEsquerdaFolhaDeRotacao.setDireita(folhaDeRotacao);
	        folhaDeRotacao.setEsquerda(netoFolhaDeRotacao);

	        folhaDeRotacao.atualizarAltura();
	        filhoEsquerdaFolhaDeRotacao.atualizarAltura();

	        return filhoEsquerdaFolhaDeRotacao;
	    }

	    private Folha rotacaoEsquerdaDireita(Folha folhaDeRotacao) {
	    	folhaDeRotacao.setEsquerda(rotacaoEsquerda(folhaDeRotacao.getEsquerda()));
	        return rotacaoDireita(folhaDeRotacao);
	    }

	    private Folha rotacaoDireitaEsquerda(Folha folhaDeRotacao) {
	    	folhaDeRotacao.setDireita(rotacaoDireita(folhaDeRotacao.getDireita()));
	        return rotacaoEsquerda(folhaDeRotacao);
	    }

	    public void preOrdem() {
	        preOrdem(raiz);
	    }

	    private void preOrdem(Folha folha) {
	        if (folha != null) {
	            preOrdem(folha.getEsquerda());
	            System.out.println(folha.getValor());
	            preOrdem(folha.getDireita());
	        }
	    }
	    
	    public boolean remover(int valor) {
	        if (raiz == null) {
	            return false;
	        }
	        
	        boolean removed = remover(raiz, null, valor);
	        if (removed) {
	            raiz.atualizarAltura(); // Atualiza a altura da raiz após a remoção
	            balancearArvore(raiz);
	        }
	        return removed;
	    }

	    private boolean remover(Folha folha, Folha pai, int valor) {
	        if (folha == null) {
	            return false;
	        }
	        
	        if (valor < folha.getValor()) {
	            return remover(folha.getEsquerda(), folha, valor);
	        } else if (valor > folha.getValor()) {
	            return remover(folha.getDireita(), folha, valor);
	        } else {
	            if (folha.getEsquerda() != null && folha.getDireita() != null) {
	                // Nó com dois filhos, encontre o sucessor e substitua o valor
	                Folha sucessor = encontrarMenorValor(folha.getDireita());
	                folha.setValor(sucessor.getValor());
	                return remover(folha.getDireita(), folha, sucessor.getValor());
	            } else {
	                // Nó com um filho ou nenhum filho
	                Folha filho = (folha.getEsquerda() != null) ? folha.getEsquerda() : folha.getDireita();
	                
	                if (pai == null) {
	                    raiz = filho;
	                } else if (folha == pai.getEsquerda()) {
	                    pai.setEsquerda(filho);
	                } else {
	                    pai.setDireita(filho);
	                }
	                return true;
	            }
	        }
	    }

	    private Folha encontrarMenorValor(Folha folha) {
	        Folha atual = folha;
	        while (atual.getEsquerda() != null) {
	            atual = atual.getEsquerda();
	        }
	        return atual;
	    }

	    private void balancearArvore(Folha folha) {
	        if (folha == null) {
	            return;
	        }
	        
	        int fatorBalanceamento = folha.getFatorBalanceamento();
	        
	        if (fatorBalanceamento > 1) {
	            if (folha.getEsquerda().getFatorBalanceamento() >= 0) {
	                // Rotação simples à direita
	                folha = rotacaoDireita(folha);
	            } else {
	                // Rotação dupla à direita-esquerda
	                folha = rotacaoDireitaEsquerda(folha);
	            }
	        } else if (fatorBalanceamento < -1) {
	            if (folha.getDireita().getFatorBalanceamento() <= 0) {
	                // Rotação simples à esquerda
	                folha = rotacaoEsquerda(folha);
	            } else {
	                // Rotação dupla à esquerda-direita
	                folha = rotacaoEsquerdaDireita(folha);
	            }
	        }
	        
	        if (folha.getFatorBalanceamento() > 1 || folha.getFatorBalanceamento() < -1) {
	            raiz = folha;
	        }
	        
	        balancearArvore(folha.getEsquerda());
	        balancearArvore(folha.getDireita());
	    }


}
