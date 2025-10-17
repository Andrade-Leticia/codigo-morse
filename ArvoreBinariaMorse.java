public class ArvoreBinariaMorse {
    Nodo raiz;

    void inicializar(){ //inicia nó raiz
        raiz = new Nodo(' ');
    }

    void inserir(String codigo, char caractere){ //insere o caractere . na esquerda - na direita
        Nodo atual = raiz;
        int i = 0;

        while (i < codigo.length()){
            char simbolo = codigo.charAt(i);

            if (simbolo == '.'){
                if (atual.esquerda == null){
                    atual.esquerda = new Nodo(' ');
                }
                atual = atual.esquerda;
            }
            else if (simbolo == '-'){
                if (atual.direita == null){
                    atual.direita = new Nodo(' ');
                }
                atual = atual.direita;
            }
            i = i + 1;
        }
        atual.caractere = caractere;
    }

}
