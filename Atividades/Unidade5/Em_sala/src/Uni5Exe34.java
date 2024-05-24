import java.util.Scanner;

public class Uni5Exe34{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    
        int total = 0;

        int opcao;

        do{
            System.out.println("Qual o opção você deseja?");
            System.out.println("(1) encerrar a conta de um hóspede;");
            System.out.println("(2) verificar número de contas encerradas;");
            System.out.println("(3) sair.");
            opcao = scanner.nextInt();
            System.out.println();

            switch (opcao) {

                case 1:
                    System.out.println("Qual o seu nome? ");
                    String nome = scanner.next();
                    System.out.println("Qual foi o número de diárias?");
                    int diaria = scanner.nextInt();
                    System.out.println();

                    double valor;
                    if (diaria < 15) {
                        valor = diaria*7.50;
                    }
                    else if (diaria == 15){
                        valor = diaria*6.50;
                    }
                    else {
                        valor = diaria*5;

                    }
                    System.out.println(nome + " a sua conta ficou em R$ " + valor);
                    total++;
                    break;
                case 2:
                    System.out.println("Contas encerradas = " + total);
                    break;
                case 3:
                    System.out.println("Atendimento encerrado");

                    break;
                default:
                    System.out.println("Opção invalida");
                    break;
                }
        } while (opcao != 3);
        scanner.close();
    }
}
    
