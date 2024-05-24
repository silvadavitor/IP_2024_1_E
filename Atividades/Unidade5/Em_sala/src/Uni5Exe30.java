import java.util.Scanner;

public class Uni5Exe30 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite o valor de N: ");
        int N = scanner.nextInt();
        System.out.print("Digite o valor de K: ");
        int K = scanner.nextInt();
        System.out.print("Digite o valor de M: ");
        int M = scanner.nextInt();
        
   
        int somaDentroMochila = 0;
        int somaForaMochila = 0;
                
        while (N > 0) {
            System.out.println();
            System.out.println("Elemento analisado = " + N); 
            if (M >= N) {
                somaDentroMochila += N;
                M -= N;
                System.out.println("O elemento " + N + " entrou na mochila");
            } else {
                System.out.println("O elemento " + N + " não entrou na mochila");
                somaForaMochila += N;
            }
            
            N -= K;
        }
        System.out.println(); 

        System.out.println("Soma dos elementos que entraram na mochila: " + somaDentroMochila);
        System.out.println("Soma dos elementos que não entraram na mochila: " + somaForaMochila);

        scanner.close();
    }
}