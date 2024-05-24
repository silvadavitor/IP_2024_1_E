import java.util.Scanner;
public class Uni6Exe01 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        int vetor[] = new int[10];

        for (int i = 9; i >= 0; i-- ){

            System.out.println("Digite o numero:");
            vetor[i] = scanner.nextInt();
        }

        System.out.println();

        for (int i :vetor){
            System.out.println(i);
        }
        scanner.close();
    }
}
