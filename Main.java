public class Main {
    public static void main(String[] args){
        ArvoreBinariaMorse arvore = new ArvoreBinariaMorse();
        arvore.inicializar();
        arvore.inserirTodos();

        boolean continuar = true;
        while (continuar) {
            System.out.println("\nMenu:");
            System.out.println("1. Inserir caractere");
            System.out.println("2. Buscar caractere");
            System.out.println("3. Remover caractere");
            System.out.println("4. Exibir árvore");
            System.out.println("5. Traduzir código Morse para texto");
            System.out.println("6. Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();
            scanner.nextLine();
            
        if (opcao == 1) { // Inserir caractere
                System.out.print("Digite o código Morse: ");
                String codigoInserir = scanner.nextLine();
                System.out.print("Digite o caractere: ");
                char caractereInserir = scanner.nextLine().charAt(0);
                arvore.inserir(codigoInserir, caractereInserir);
                System.out.println("Caractere inserido!");
            } else if (opcao == 2) { // Buscar caractere
                System.out.print("Digite o código Morse: ");
                String codigoBuscar = scanner.nextLine();
                System.out.println("Caractere encontrado: " + arvore.buscarLetra(codigoBuscar));
            } else if (opcao == 3) { // Remover caractere
                System.out.print("Digite o código Morse do caractere a ser removido: ");
                String codigoRemover = scanner.nextLine();
                arvore.remover(codigoRemover);
                System.out.println("Caractere removido!");
            } else if (opcao == 4) { // Exibir árvore
                System.out.println("\nÁrvore binária Morse:");
                arvore.exibirArvore();
            } else if (opcao == 5) { // Traduzir código Morse para texto
                System.out.print("Digite uma mensagem em código Morse (separada por espaços): ");
                String mensagem = scanner.nextLine();
                String resultado = arvore.buscar(mensagem);
                System.out.println("Mensagem traduzida: " + resultado);
            } else if (opcao == 6) { // Sair
                continuar = false;
            } else {
                System.out.println("Opção inválida!");
            }
        }
    }
}
