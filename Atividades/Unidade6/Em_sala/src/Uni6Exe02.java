import java.util.Scanner;
public class Uni6Exe02{
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        double vetor[] = new double[12];
        double media = 0;
        for (int i = 0; i < vetor.length; i++ ){

            System.out.println("Digite o numero:");
            vetor[i] = scanner.nextInt();
        }

        System.out.println();

        for (double i :vetor){
            media += i;

        }
        media = media/12;
        
        for (double i : vetor){
            if (i > media){
                System.out.println(i);
            }
        }
        scanner.close();
    }
}
