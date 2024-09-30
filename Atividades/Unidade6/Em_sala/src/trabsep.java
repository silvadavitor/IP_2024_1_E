import java.util.Random;
import java.util.Scanner;

// UNIDIMENSIONAL
public class trabsep {
    public static void main(String[] args) {
        final int TAMANHO = 8;
        final int NAVIOS = 10;
        final int MAX_JOGADAS = 30;

        char[] tabuleiroLinhas = new char[TAMANHO * TAMANHO];
        char[] tabuleiroColunas = new char[TAMANHO * TAMANHO];
        char[] tabuleiroVisivelLinhas = new char[TAMANHO * TAMANHO];
        char[] tabuleiroVisivelColunas = new char[TAMANHO * TAMANHO];
        
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        // Inicializa os vetores com água ('~')
        for (int i = 0; i < TAMANHO * TAMANHO; i++) {
            tabuleiroLinhas[i] = '~';
            tabuleiroColunas[i] = '~';
            tabuleiroVisivelLinhas[i] = '~';
            tabuleiroVisivelColunas[i] = '~';
        }

        // Posiciona aleatoriamente 10 navios ('N')
        int naviosPosicionados = 0;
        while (naviosPosicionados < NAVIOS) {
            int posicao = random.nextInt(TAMANHO * TAMANHO);
            if (tabuleiroLinhas[posicao] == '~') {
                tabuleiroLinhas[posicao] = 'N';
                tabuleiroColunas[posicao] = 'N';
                naviosPosicionados++;
            }
        }

        // Loop principal do jogo
        int jogadas = 0;
        int naviosDestruidos = 0;
        while (jogadas < MAX_JOGADAS && naviosDestruidos < NAVIOS) {
            System.out.println("Tabuleiro atual:");
            imprimirTabuleiro(tabuleiroVisivelLinhas, tabuleiroVisivelColunas, TAMANHO);

            System.out.println("Digite as coordenadas de ataque (linha e coluna de 1 a 8):");
            int linha = scanner.nextInt() - 1;
            int coluna = scanner.nextInt() - 1;

            if (linha < 0 || linha >= TAMANHO || coluna < 0 || coluna >= TAMANHO) {
                System.out.println("Coordenadas inválidas. Tente novamente.");
                continue;
            }

            int posicao = linha * TAMANHO + coluna;

            if (tabuleiroVisivelLinhas[posicao] == 'X' || tabuleiroVisivelLinhas[posicao] == 'O') {
                System.out.println("Você já atacou essa posição. Tente novamente.");
                continue;
            }

            jogadas++;

            if (tabuleiroLinhas[posicao] == 'N') {
                System.out.println("Acertou um navio!");
                tabuleiroVisivelLinhas[posicao] = 'X';
                tabuleiroVisivelColunas[posicao] = 'X';
                naviosDestruidos++;
            } else {
                System.out.println("Errou!");
                tabuleiroVisivelLinhas[posicao] = 'O';
                tabuleiroVisivelColunas[posicao] = 'O';
            }
        }

        // Exibe o resultado final
        if (naviosDestruidos == NAVIOS) {
            System.out.println("Parabéns! Você destruiu todos os navios!");
        } else {
            System.out.println("Fim de jogo! Você não conseguiu destruir todos os navios.");
        }

        System.out.println("Tabuleiro final:");
        revelarNavios(tabuleiroLinhas, tabuleiroColunas, tabuleiroVisivelLinhas, tabuleiroVisivelColunas, TAMANHO);
        imprimirTabuleiro(tabuleiroVisivelLinhas, tabuleiroVisivelColunas, TAMANHO);
    }

    // Função para imprimir o tabuleiro
    public static void imprimirTabuleiro(char[] linhas, char[] colunas, int tamanho) {
        System.out.print("  ");
        for (int j = 1; j <= tamanho; j++) {
            System.out.print(j + " ");
        }
        System.out.println();

        for (int i = 0; i < tamanho; i++) {
            System.out.print((i + 1) + " ");
            for (int j = 0; j < tamanho; j++) {
                System.out.print(linhas[i * tamanho + j] + " ");
            }
            System.out.println();
        }
    }

    // Função para revelar a posição dos navios no final do jogo
    public static void revelarNavios(char[] linhas, char[] colunas, char[] linhasVisiveis, char[] colunasVisiveis, int tamanho) {
        for (int i = 0; i < tamanho * tamanho; i++) {
            if (linhas[i] == 'N') {
                linhasVisiveis[i] = 'N';
                colunasVisiveis[i] = 'N';
            }
        }
    }
}
