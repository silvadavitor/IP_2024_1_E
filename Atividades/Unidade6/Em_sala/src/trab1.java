import java.util.Random;
import java.util.Scanner;

public class trab1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int cont = 0;
        boolean jogo = false;
        char tabu [][] = new char[8][8];
        char tabuMostra [][] = new char[8][8];
        int colocados = 0;
        int navios =0;

        // DEFINE COMO ~
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                tabu[i][j] = '~';
                tabuMostra[i][j] = '~';
            }
        }

        // Coloca os navios
        while (colocados < 10) {
            int linha = random.nextInt(8);
            int coluna = random.nextInt(8);
            if (tabu[linha][coluna] == '~') {
                tabu[linha][coluna] = 'N';
                colocados++;
            }
        }

        do {
            // IMPRIME ESCONDIDO
            System.out.println();
            System.out.println("Tabuleiro:");
            System.out.print("  ");
            for (int j = 0; j < tabuMostra.length; j++) {
                System.out.print(j + 1 + " ");
            }
            System.out.println();
    
            for (int i = 0; i < tabuMostra.length; i++) {
                System.out.print((i + 1) + " ");
                for (int j = 0; j < tabuMostra[i].length; j++) {
                    System.out.print(tabuMostra[i][j] + " ");
                }
                System.out.println();
            }

            // PEDE AS COORDENADAS
            System.out.println("Digite as coordenadas de ataque:");
            int linha = scanner.nextInt() - 1; // Corrigido para 0-7
            int coluna = scanner.nextInt() - 1; // Corrigido para 0-7
            System.out.println();

            // FAZ OS TESTES
            if (linha < 0 || linha > 7 || coluna < 0 || coluna > 7) {
                System.out.println("Coordenadas inválidas.");
                continue;
            }

            if (tabuMostra[linha][coluna] == 'X' || tabuMostra[linha][coluna] == 'O') {
                System.out.println("Você já atacou essa posição.");
                continue;
            }
            
            // TESTES NO TABULEIRO
            if (tabu[linha][coluna] == 'N') {
                System.out.println("NA MOSCA, ACERTOU EM CHEIO CAPITÃO!");
                tabuMostra[linha][coluna] = 'X';
                navios++;
            } else {
                System.out.println("ERROUUU");
                tabuMostra[linha][coluna] = 'O';
            }
            if (navios == 10){
                System.out.println("VOCÊ GANHOU O JOGO");
                jogo = true;
            }
            

            cont++;
        } while (cont < 30 && !jogo);

        if (navios < 10) {
            System.out.println("Você perdeu :(. Faltaram " + (10 - navios) + " navios para ganhar");    
        } else {
            System.out.println("Fim de jogo!");
        }

        // Revelar todos os navios
        for (int i = 0; i < tabu.length; i++) {
            for (int j = 0; j < tabu[i].length; j++) {
                if (tabu[i][j] == 'N') {
                    tabuMostra[i][j] = 'N';
                }
            }
        }

        // Imprimir tabuleiro final
        System.out.println();
        System.out.println("Tabuleiro final:");
        System.out.print("  ");
        for (int j = 0; j < tabuMostra.length; j++) {
            System.out.print(j + 1 + " ");
        }
        System.out.println();

        for (int i = 0; i < tabuMostra.length; i++) {
            System.out.print((i + 1) + " ");
            for (int j = 0; j < tabuMostra[i].length; j++) {
                System.out.print(tabuMostra[i][j] + " ");
            }
            System.out.println();
        }

        scanner.close();
    }
}
