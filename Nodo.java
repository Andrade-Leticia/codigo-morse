public class Nodo { //estrutura do nodo
    char caractere;
    Nodo esquerda;
    Nodo direita;

    Nodo(char caractere){
        this.caractere = caractere;
        this.esquerda = null;
        this.direita = null;
    }
}
