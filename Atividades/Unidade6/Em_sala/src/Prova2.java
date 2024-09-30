import java.util.Scanner;

public class Prova2 {

    public static String inserir(String nome, int peso, String[] valores, int[] pesos, int itemCont, int capacidade) {
        if (peso > capacidade) {
            return "O peso da espaçonave foi ultrapassado";
        }
        valores[itemCont] = nome;
        pesos[itemCont] = peso;
        return "Item adicionado com sucesso na espaço nave.";
    }


    public static void imprimirEspaconave(String[] valores, int[] pesos, int itemCont) {
        System.out.println("Espaçonave atual:");
        for (int i = itemCont - 1; i >= 0; i--) {
            if (valores[i] != null) {
                System.out.print("[" + valores[i] + " = " + pesos[i] + "kg], ");
            }
        }                
        System.out.println();
    }


    public static void valorItemMaisPesado(String[] valores, int[] pesos, int itemCont) {
        if (itemCont == 0) {
            System.out.println("A espaçonave está vazia.");
        }
        else{
            int maxItem = 0;
            for (int i = 1; i < itemCont; i++) {
                if (pesos[i] > pesos[maxItem]) {
                    maxItem = i;
                }
            }

            System.out.println("O item mais pesado é o: " + valores[maxItem] + " = " + pesos[maxItem] + "kg");}
    }


    public static void ordenarEspaconave(String[] valores, int[] pesos, int itemCont) {
        for (int i = 0; i < itemCont - 1; i++) {
            for (int j = i + 1; j < itemCont; j++) {
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

        System.out.println("Espaçonave ordenada:");
        imprimirEspaconave(valores, pesos, itemCont);
    }


    public static int excluirItemEspaconave(Scanner scanner, String[] valores, int[] pesos, String valorEx, int itemCont, int capacidade) {
        if (itemCont == 0) {
            System.out.println("A espaçonave está vazia.");
            return capacidade;
        }
        for (int i = 0; i < itemCont; i++) {
            if (valores[i].equals(valorEx)) {
                capacidade += pesos[i];
                valores[i] = valores[itemCont - 1];
                pesos[i] = pesos[itemCont - 1]; 
                valores[itemCont - 1] = null;
                pesos[itemCont - 1] = 0;
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

        System.out.println("Qual é o tamanho da espaçonave? ");
        int tamanho = scanner.nextInt();

        System.out.println("Qual a capacidade da espaçonave em Kg? ");
        int capacidade = scanner.nextInt();

        String[] valores = new String[tamanho];
        int[] pesos = new int[tamanho];
        int itemCont = 0;

        int opc;

        do {
            System.out.println();
            System.out.println("Escolha uma opção: ");
            System.out.println("1 - Inserir item");
            System.out.println("2 - Mostrar espaçonave");
            System.out.println("3 - Valor do item mais pesado");
            System.out.println("4 - Ordenar espaçonave");
            System.out.println("5 - Excluir item da espaçonave");
            System.out.println("6 - Sair");
            opc = scanner.nextInt();
            System.out.println();

            switch (opc) {
                case 1:
                    if (itemCont >= valores.length) {
                        System.out.println("Não há espaço para mais objetos na espaçonave");
                        break;
                    }

                    System.out.println("Qual o nome do valor? ");
                    String nome = scanner.next();
                    System.out.println();
                    System.out.println("Qual o peso do valor? ");
                    int peso = scanner.nextInt();
                    System.out.println();

                    String mensagem = inserir(nome, peso, valores, pesos, itemCont, capacidade);
                    System.out.println(mensagem);
                    if (mensagem.equals("Item adicionado com sucesso na espaço nave.")) {
                        itemCont++;
                        capacidade -= peso;
                    }
                    break;

                case 2:
                    imprimirEspaconave(valores, pesos, itemCont);
                    break;

                case 3:
                    valorItemMaisPesado(valores, pesos, itemCont);
                    break;

                case 4:
                    ordenarEspaconave(valores, pesos, itemCont);
                    break;

                case 5:
                    System.out.println("Qual o nome do item que deseja excluir?");
                    String valorEx = scanner.next();

                    capacidade = excluirItemEspaconave(scanner, valores, pesos, valorEx, itemCont, capacidade);
                    if (itemCont > 0) {
                        itemCont--;
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
