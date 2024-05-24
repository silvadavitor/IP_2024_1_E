import java.util.Scanner;
public class Uni6Exe03{
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        double vetor[] = new double[12];
        int cont = 0;
        for (int i = 0; i < vetor.length; i++ ){

            System.out.println("Digite o numero:");
            vetor[i] = scanner.nextInt();
        }

        System.out.println();

        for (double i : vetor){
            if (cont%2 == 0){
                vetor[cont] = i+(i*0.02);
            }
            else{
                vetor[cont] = i+(i*0.05);
            }
            cont++;

        }        
        for (double i : vetor){
            System.out.println(i);

        }
        scanner.close();
    }
}
