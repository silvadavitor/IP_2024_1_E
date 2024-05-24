import java.util.Scanner;

public class Uni6Exe09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sexo [] = new int[30];
        int nota [] = new int[30];
        int idade [] = new int[30];
        int totalMu50 = 0;
        int sonaNotCin = 0;
        int somaNotH = 0;
        int menorNotMulherMaisJovem = 0;

        for (int i = 0; i < 30; i++) {
            System.out.println("Cliente " + (i + 1) + ":");
            System.out.print("Sexo (1=feminino, 2=masculino): ");
            sexo[i] = scanner.nextInt();
            System.out.print("Nota para o cinema (0 até 10): ");
            nota[i] = scanner.nextInt();
            System.out.print("Idade: ");
            idade[i] = scanner.nextInt();

            sonaNotCin += nota[i];

            if (sexo[i] == 2) { 
                somaNotH += nota[i];
            }

            if (sexo[i] == 1 && idade[i] < menorNotMulherMaisJovem) { 
                menorNotMulherMaisJovem = nota[i];
            }

            if (sexo[i] == 1 && idade[i] > 50 && nota[i] > sonaNotCin / 30) {
                totalMu50++;
            }
        }

        double medianota = (double) sonaNotCin / 30;
        double mediaNotaHomens = (double) somaNotH / (30 / 2);

        System.out.println("Nota média recebida pelo cinema: " + medianota);
        System.out.println("Nota média atribuída pelos homens: " + mediaNotaHomens);
        System.out.println("Nota atribuída pela mulher mais jovem: " + menorNotMulherMaisJovem);
        System.out.println("Quantidade de mulheres com mais de 50 anos que deram nota superior à média recebida pelo cinema: " + totalMu50);

        scanner.close();
    }
}
