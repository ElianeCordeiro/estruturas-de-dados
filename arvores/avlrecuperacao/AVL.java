package avlrecuperacao;

public class AVL {


    private No raiz;

    public AVL(int info) {
        this.raiz = null;
        insere(info);
    }


    public void insere(int info) {
    	raiz = insere(raiz, info);
    }


    public void remove(int info) {
    	raiz = remove(raiz, info);
    }



    

    private No rotacaoDireita(No noRotacao) {
        No filhoEsquerdaNoRotacao = noRotacao.esquerda;
        No netoDireitaNoRotacao= filhoEsquerdaNoRotacao.direita;

        filhoEsquerdaNoRotacao.direita = noRotacao;
        noRotacao.esquerda = netoDireitaNoRotacao;

        noRotacao.altura = 1 + Math.max(altura(noRotacao.esquerda), altura(noRotacao.direita)) ;
        filhoEsquerdaNoRotacao.altura = 1 + Math.max(altura(filhoEsquerdaNoRotacao.esquerda), altura(filhoEsquerdaNoRotacao.direita));

        return filhoEsquerdaNoRotacao;
    }



    private No rotacaoEsquerda(No noRotacao) {
        No filhoDiretaNoRotacao = noRotacao.direita;
        No netoEsquerdoNoRtoacao = filhoDiretaNoRotacao.esquerda;

        filhoDiretaNoRotacao.esquerda = noRotacao;
        noRotacao.direita = netoEsquerdoNoRtoacao;

        noRotacao.altura = 1  + Math.max(altura(noRotacao.esquerda), altura(noRotacao.direita));
        filhoDiretaNoRotacao.altura = 1 + Math.max(altura(filhoDiretaNoRotacao.esquerda), altura(filhoDiretaNoRotacao.direita));

        return filhoDiretaNoRotacao;
    }



    private No insere(No no, int info) {
        if (no == null) {
        	return new No(info);
        }

        if (info < no.info) {
            no.esquerda = insere(no.esquerda, info);
        
        } else if (info > no.info) {
            no.direita = insere(no.direita, info);

        } else {
            return no; // sem numeros repetidos
        }

        no.altura = 1 + Math.max(altura(no.esquerda), altura(no.direita));

        int fator = fatorBalanceamento(no);

        if (fator > 1) {
            if (info < no.esquerda.info) {
                return rotacaoDireita(no);

            } else {
                no.esquerda = rotacaoEsquerda(no.esquerda);
                return rotacaoDireita(no);
            }
        }

        if (fator < -1) {
            if (info > no.direita.info) {
                return rotacaoEsquerda(no);

            } else {
                no.direita = rotacaoDireita(no.direita);
                return rotacaoEsquerda(no);
            }
        }

        return no;

    }

    private No getMenorValorNo(No no) {
        while (no.esquerda != null) {
            no = no.esquerda;
        }
        return no;
    }

    private No remove(No no, int info) {
        if (no == null) {
        	return no;
        }

        if (info < no.info) {
            no.esquerda = remove(no.esquerda, info);

        } else if (info > no.info) {
            no.direita = remove(no.direita, info);

        } else {
            if ((no.esquerda == null) || (no.direita == null)) {
                No temp = null;
                if (no.esquerda != null) {
                    temp = no.esquerda;

                } else {
                    temp = no.direita;
                }

                if (temp == null) {
                    temp = no;
                    no = null;

                } else {
                    no = temp;
                }

            } else {
                No temp = getMenorValorNo(no.direita);
                no.info = temp.info;
                no.direita = remove(no.direita, temp.info);
            }
        }

        if (no == null) {
            return no;

        }

        no.altura = 1 + Math.max(altura(no.esquerda), altura(no.direita));

        int fator = fatorBalanceamento(no);

        if (fator > 1) {
            if (fatorBalanceamento(no.direita) >= 0) {
                return rotacaoDireita(no);

            } else {
                no.esquerda = rotacaoEsquerda(no.esquerda);
                return rotacaoDireita(no);
            }
        }

        if (fator < -1) {
            if (fatorBalanceamento(no.direita) <= 0) {
                return rotacaoEsquerda(no);

            } else {
                no.direita = rotacaoDireita(no.direita);
                return rotacaoEsquerda(no);
            }
        }

        return no;
    }


    public String preOrdem() {
        StringBuilder resultado = new StringBuilder();
        preOrdem(raiz, resultado);
        return resultado.toString();
    }

    private void preOrdem(No no, StringBuilder resultado) {

        if (no != null) {
        	resultado.append(no.info).append(" ");
            preOrdem(no.esquerda, resultado);
            preOrdem(no.direita, resultado);
        }
    }

    private int fatorBalanceamento(No no) {
        if (no == null) {
        	return 0;
        }
        return altura(no.esquerda) - altura(no.direita);
    }

    private int altura(No no) {

        if (no == null) {
        	return 0;
        }

        return no.altura;

    }

}
