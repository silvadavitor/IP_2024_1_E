import java.util.Scanner;
public class Uni6Exe06{
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Informe um valor inteiro");
        int valInt = scanner.nextInt();

        double vetor[] = new double[valInt];
        boolean valor = false;
        System.out.println();

        for (int i = 0; i < vetor.length; i++){
            System.out.println("Informe o valor " + (i+1) + " do vetor");
            vetor[i] = scanner.nextDouble();
        }
        System.out.println();
        System.out.println("Informe um valor real para comparar");
        double valCom = scanner.nextDouble();

        for (int i = 0; i < vetor.length; i++){
            if (valCom == vetor[i]) {
                valor = true;
            }
        }
        if (valor){
            System.out.println("O valor " + valCom + " se encontra no vetor");
        }
        else{
            System.out.println("Esse valor não possue no vetor");
        }
        scanner.close();
    }
}
