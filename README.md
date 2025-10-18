# Árvore Binária com Código Morse

## Feito por:
  - Alana da Conceição Queiroz
  - Brenda Gabrielli Barbosa
  - Leticia Maria Maia de Andrade Vieira

---

## Descrição do Projeto
Este projeto implementa uma árvore binária que representa o alfabeto do código Morse, onde cada nó corresponde a um símbolo seja ele uma letra ou número. O lado esquerdo da árvore representa o ponto (·) e o lado direito representa o traço (–).
Cada caminho da raiz até um nó folha define a sequência de pontos e traços correspondente a um caractere. O sistema permite inserir, buscar, remover e exibir caracteres, além de traduzir mensagens em Morse para texto.

## Objetivos
  1. Representar todas as letras do alfabeto (A–Z) e os números (0–9) por meio de uma árvore binária.
  2. Permitir a manipulação da árvore com inserção, busca e remoção de caracteres.
  3. Exibir a estrutura hierárquica da árvore de forma clara.
  4. Traduzir mensagens em código Morse para texto comum.

## Estruturas do Código
Nodo.java: Classe que define a estrutura de cada nó da árvore.
ArvoreBinariaMorse.java: Classe principal que contém toda a lógica da árvore binária de código Morse. Principais métodos da classe: 
  - inicializar(): Cria a raiz da árvore.
  - inserir(String codigo, char caractere): Insere um caractere conforme sua sequência de pontos (esquerda) e traços (direita).
  - inserirTodos(): Preenche automaticamente a árvore com todas as letras A–Z e números 0–9.
  - buscarLetra(String codigo): Retorna o caractere correspondente a um código Morse.
  - buscar(String mensagem): Traduz uma sequência de códigos Morse separados por espaços.
  - exibirArvore(): Exibe a árvore hierarquicamente no console.
  - remover(String codigo): Remove um caractere da árvore sem perder a estrutura.

Main.java: Classe responsável pela interação com o usuário por meio de um menu. Funcionalidades do menu:
  1. Inserir caractere: Adiciona um novo caractere à árvore.
  2. Buscar caractere: Mostra qual caractere corresponde a um código Morse informado.
  3. Remover caractere: Remove um caractere específico da árvore.
  4. Exibir árvore: Mostra a árvore binária completa.
  5. Traduzir código Morse para texto: Converte uma mensagem em Morse (separada por espaços) em texto.
  6. Sair: Encerra o programa.

## Tecnologias Utilizadas
Linguagem: Java (sem uso de bibliotecas prontas de estrutura de dados).
Ambiente de execução: Terminal / Console.
Classes utilizadas: String, Scanner, System.out.

## Como Executar o Projeto
1. Compile os arquivos:
   javac Nodo.java ArvoreBinariaMorse.java Main.java
2. Execute o programa:
   java Main
3. Interaja pelo menu para inserir, buscar, remover ou traduzir mensagens Morse.

## Exemplo de Tradução
Entrada:
  Digite uma mensagem em código Morse (separada por espaços): ... --- ...
Saída:
  Mensagem traduzida: SOS

## Funcionamento da Árvore
Usando o teste de uso sugerido pela documentação do trabalho, obteriamos a seguinte árvore para mensagem "SOS":
  - S = ... (ponto ponto ponto)
  - O = --- (traço traço traço)
  - S = ... (ponto ponto ponto)

Na árvore binária, cada ponto (·) significa ir para a esquerda e cada traço (–) significa ir para a direita, com isso teriamos o seguinte caminho:
| Letra | Caminho na Árvore | Direção                        |
| ----- | ----------------- | ------------------------------ |
| S     | `...`             | esquerda → esquerda → esquerda |
| O     | `---`             | direita → direita → direita    |
| S     | `...`             | esquerda → esquerda → esquerda |

Representação Parcial da Árvore Morse ( considerando inserções aleatórias de letras feitas pelo usuário):
<img width="312" height="284" alt="image" src="https://github.com/user-attachments/assets/e7104615-8c32-4bb2-b9d5-efad1748fc90" />

            
Para “SOS” o programa percorre:
  S  → ... → E → I → S
  O  → --- → T → M → O
  S  → ... → E → I → S

Juntando os resultados: 
  Mensagem traduzida: SOS
