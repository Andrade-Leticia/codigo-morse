public class Main {
    public static void main(String[] args){
        ArvoreBinariaMorse arvore = new ArvoreBinariaMorse();
        arvore.inicializar();

        //inserir
        arvore.inserir("...", 'S'); //exemplo de uso do documento
        arvore.inserir("---",'O');

        System.out.println("buscando '...': " + arvore.buscar("..."));
        System.out.println("buscando '---': " + arvore.buscar("---"));

        // imprime a árvore:

        System.out.println("\nÁrvore binária morse: ");
        arvore.exibirArvore();

    }
}