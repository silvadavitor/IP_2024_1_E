import java.util.Scanner;

public class Uni6Exe10 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um valor inteiro menor que 50");
        int valInt = scanner.nextInt();
        int vetor [] = new int[valInt];
        int cont = 0;

        int opcao;
        do {
            System.out.println("\n*** Menu de Opções ***");
            System.out.println("1 - Incluir valor");
            System.out.println("2 - Pesquisar valor");
            System.out.println("3 - Alterar valor");
            System.out.println("4 - Excluir valor");
            System.out.println("5 - Mostrar valores");
            System.out.println("6 - Ordenar valores");
            System.out.println("7 - Inverter valores");
            System.out.println("8 - Sair do sistema");
            System.out.print("Escolha uma opção: ");

            opcao = scanner.nextInt();
            scanner.nextLine(); 

            switch (opcao) {
                case 1:
                    if (cont < vetor.length) {
                        System.out.print("Informe o valor a ser incluído: ");
                        int valor = scanner.nextInt();
                        vetor[cont++] = valor;
                        System.out.println("Valor incluído no vetor.");
                    } else {
                        System.out.println("O vetor está cheio. Não é possível incluir mais valores.");
                    }
                    break;
                case 2:
                    System.out.print("Informe o valor a ser pesquisado: ");
                    int valorPesquisa = scanner.nextInt();
                    boolean encontrado = false;
                    for (int i = 0; i < cont; i++) {
                        if (vetor[i] == valorPesquisa) {
                            encontrado = true;
                            break;
                        }
                    }
                    if (encontrado) {
                        System.out.println("O valor " + valorPesquisa + " está no vetor.");
                    } else {
                        System.out.println("O valor " + valorPesquisa + " não está no vetor.");
                    }
                    break;
                case 3:
                    System.out.print("Informe o valor a ser alterado: ");
                    int valAntigo = scanner.nextInt();
                    boolean encontradoAlterar = false;
                    for (int i = 0; i < cont; i++) {
                        if (vetor[i] == valAntigo) {
                            System.out.print("Informe o novo valor: ");
                            int novoValor = scanner.nextInt();
                            vetor[i] = novoValor;
                            encontradoAlterar = true;
                            System.out.println("Valor alterado com sucesso.");
                            break;
                        }
                    }
                    if (!encontradoAlterar) {
                        System.out.println("Número não encontrado.");
                    }
                    break;
                case 4:
                    System.out.print("Informe o valor a ser excluído: ");
                    int valorExcluir = scanner.nextInt();
                    boolean encontradoExcluir = false;
                    for (int i = 0; i < cont; i++) {
                        if (vetor[i] == valorExcluir) {
                            encontradoExcluir = true;
                            for (int j = i; j < cont - 1; j++) {
                                vetor[j] = vetor[j + 1];
                            }
                            cont--;
                            System.out.println("Valor excluído do vetor.");
                            break;
                        }
                    }
                    if (!encontradoExcluir) {
                        System.out.println("O valor " + valorExcluir + " não está no vetor.");
                    }
                    break;
                case 5:
                    if (cont == 0) {
                        System.out.println("O vetor está vazio.");
                    } else {
                        System.out.println("Valores armazenados no vetor:");
                        for (int i = 0; i < cont; i++) {
                            System.out.print(vetor[i] + " ");
                        }
                        System.out.println();
                    }
                    break;
                case 6:
                    int k = 0;
                    while (k < (vetor.length-1)) {
                        if (vetor[k] > vetor[k+1]){
                            int bolha = vetor[k];
                            vetor[k] = vetor[k+1];
                            vetor[k+1] = bolha;
                            k = 0;
                        }
                        else{
                            k++;
                        }
                    }
                    System.out.println("Valores ordenados em ordem crescente.");
                    break;
                case 7:
                    for (int i = 0; i < cont / 2; i++) {
                        int temp = vetor[i];
                        vetor[i] = vetor[cont - i - 1];
                        vetor[cont - i - 1] = temp;
                    }
                    System.out.println("Valores invertidos.");
                    break;
                case 8:
                    System.out.println("Saindo do sistema...");
                    break;
                default:
                    System.out.println("Opção inválida. Por favor, escolha uma opção válida.");
            }
        } while (opcao != 8);

        scanner.close();
    }
}
