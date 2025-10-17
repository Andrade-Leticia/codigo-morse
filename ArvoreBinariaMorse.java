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

    // percorre a árvore e retorna o caractere encontrado conforme código morse
    char buscarLetra(String codigo){
        Nodo atual = raiz;
        for (int i = 0; i < codigo.length(); i++){
            char simbolo = codigo.charAt(i);
            if (simbolo == '.') {
                if (atual.esquerda == null)
                    return '?'; // simbolo não encontrado
                atual = atual.esquerda;
            } else if (simbolo == '-'){
                if (atual.direita == null)
                    return '?'; // não encontrado
                atual = atual.direita;
            }

        }
        return atual.caractere;
    }

    // retornar mensagem montada
    String buscar(String mensagem){
        String resultado = "";
        String codigo = "";

        for (int i = 0; i < mensagem.length(); i++){
            char c = mensagem.charAt(i);

            if (c != ' ') {
                codigo = codigo + c; // formação do código
            } else {
                if (!codigo.isEmpty()){
                    resultado = resultado + buscarLetra(codigo);
                    codigo = "";
                }
            }
        }

        if (!codigo.isEmpty())
            resultado = resultado + buscarLetra(codigo);
        return resultado;

    }

    void exibirArvore(){
        exibirArvoreRec(raiz, 0);
    }

    void exibirArvoreRec(Nodo no, int nivel){
        if (no == null)
            return;

        // imprime primeiro a direita e depois a esquerda
        exibirArvoreRec(no.direita, nivel+ 1);

        for (int i = 0; i < nivel; i++)
            System.out.println("  ");
        System.out.println(no.caractere);

        exibirArvoreRec(no.esquerda, nivel + 1);
    }

}
