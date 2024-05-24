import java.util.Scanner;

public class Uni6Exe08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe um valor menor que 20:");
        int valInt = scanner.nextInt();

        double vetor [] = new double[valInt];

        for (int i = 0; i < vetor.length; i++) {
            System.out.println("Informe o valor para a posição " + (i + 1));
            vetor[i] = scanner.nextDouble();
        }

        System.out.println("Tabela");
     
        boolean[] valorContado = new boolean[vetor.length];

        for (int i = 0; i < vetor.length; i++) {
            if (!valorContado[i]) {
                double valor = vetor[i];
                int frequencia = 1;

                for (int j = i + 1; j < vetor.length; j++) {
                    if (vetor[j] == valor) {
                        frequencia++;
                        valorContado[j] = true; 
                    }
                }

                System.out.println(valor + "   =   " + frequencia);
            }
        }

        scanner.close();
    }
}
