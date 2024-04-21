import java.util.Scanner;

public class Uni3Uri8 {
    public static void main(String[] args){

        try (Scanner scanner = new Scanner(System.in)){
        int cod1 = scanner.nextInt(); int num1 = scanner.nextInt(); double val1 = scanner.nextDouble();
        int cod2 = scanner.nextInt(); int num2 = scanner.nextInt(); double val2 = scanner.nextDouble();
        System.out.printf("VALOR A PAGAR: R$ %.2f%n", ((num1*val1)+(num2*val2)));
    }
        
    }
}
