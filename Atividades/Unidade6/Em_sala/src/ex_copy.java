import java.util.Scanner;

public class ex_copy {

    // Metodos/Funções
    public static String inserir(String nome, int peso, String[] valores, int[] pesos, int itemContador, int capacidade) {
        if (peso > capacidade) {
            return "O peso da mochila foi ultrapassado";
        }
        valores[itemContador] = nome;
        pesos[itemContador] = peso;
        return "Item adicionado com sucesso.";
    }

    public static void imprimirEspaconave(String[] valores, int[] pesos, int itemContador) {
        System.out.println("Espaçonave atual:");
        for (int i = itemContador - 1; i >= 0; i--) {
            if (valores[i] != null) {
                System.out.print("[" + valores[i] + " = " + pesos[i] + "kg], ");
            }
        }                
        System.out.println();
    }

    public static void itemPesado(String[] valores, int[] pesos, int itemContador) {
        if (itemContador == 0) {
            System.out.println("A mochila está vazia.");
        }
        else{
            int maxItem = 0;
            for (int i = 1; i < itemContador; i++) {
                if (pesos[i] > pesos[maxItem]) {
                    maxItem = i;
                }
            }

            System.out.println("O item mais pesado é o: " + valores[maxItem] + " = " + pesos[maxItem] + "kg");}
    }

    public static void ordenarMochila(String[] valores, int[] pesos, int itemContador) {
        for (int i = 0; i < itemContador - 1; i++) {
            for (int j = i + 1; j < itemContador; j++) {
                if (pesos[i] < pesos[j]) {
                    int tempPeso = pesos[i];
                    pesos[i] = pesos[j];
                    pesos[j] = tempPeso;
                    String tempNome = valores[i];
                    valores[i] = valores[j];
                    valores[j] = tempNome;
                }
            }
        }

        System.out.println("Mochila ordenada:");
        imprimirEspaconave(valores, pesos, itemContador);
    }

    public static int excluirItem(Scanner scanner, String[] valores, int[] pesos, String valorEx, int itemContador, int capacidade) {
        if (itemContador == 0) {
            System.out.println("A mochila está vazia.");
            return capacidade;
        }
        if (itemContador == 1){
            valores[0] = null;
            pesos[0] = 0;
        }


        for (int i = 0; i < itemContador; i++) {
            if (valores[i].equals(valorEx)) {
                capacidade += pesos[i];
                valores[i] = valores[itemContador - 1];
                pesos[i] = pesos[itemContador - 1]; 
                valores[itemContador - 1] = null;
                pesos[itemContador - 1] = 0;
                System.out.println("Item excluído.");
                return capacidade;
            }
        }

        System.out.println("Item não encontrado.");
        return capacidade;
    }


    // Metodo Principal - Main
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual é o tamanho da mochila? ");
        int tamanho = scanner.nextInt();

        System.out.println("Qual a capacidade da mochila em Kg? ");
        int capacidade = scanner.nextInt();

        String[] valores = new String[tamanho];
        int[] pesos = new int[tamanho];
        int itemContador = 0;

        int opc;

        do {
            System.out.println();
            System.out.println("Escolha uma opção: ");
            System.out.println("1 - Inserir item");
            System.out.println("2 - Mostrar mochila");
            System.out.println("3 - Valor do item mais pesado");
            System.out.println("4 - Ordenar mochila");
            System.out.println("5 - Excluir item da mochila");
            System.out.println("6 - Sair");
            opc = scanner.nextInt();
            System.out.println();

            switch (opc) {
                case 1:
                    if (itemContador >= valores.length) {
                        System.out.println("Não há espaço para mais objetos na mochila");
                        break;
                    }

                    System.out.println("Qual o nome do valor? ");
                    String nome = scanner.next();
                    System.out.println();
                    System.out.println("Qual o peso do valor? ");
                    int peso = scanner.nextInt();
                    System.out.println();

                    String mensagem = inserir(nome, peso, valores, pesos, itemContador, capacidade);
                    System.out.println(mensagem);
                    if (mensagem.equals("Objeto adicionado com sucesso.")) {
                        itemContador++;
                        capacidade -= peso;
                    }
                    break;

                case 2:
                    imprimirEspaconave(valores, pesos, itemContador);
                    break;

                case 3:
                    itemPesado(valores, pesos, itemContador);
                    break;

                case 4:
                    ordenarMochila(valores, pesos, itemContador);
                    break;

                case 5:
                    System.out.println("Qual o nome do item que deseja excluir?");
                    String valorEx = scanner.nextLine();

                    capacidade = excluirItem(scanner, valores, pesos, valorEx, itemContador, capacidade);
                    if (itemContador > 0) {
                        itemContador--;
                    }
                    break;

                case 6:
                    System.out.println("Programa terminado");
                    break;
                default:
                    System.out.println("Opção inválida");
                    break;
            }

        } while (opc != 6);
    }

}

