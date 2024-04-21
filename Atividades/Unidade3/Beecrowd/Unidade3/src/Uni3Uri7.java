import java.util.Scanner;

public class Uni3Uri7 {
    public static void main(String[] args){

        try (Scanner scanner = new Scanner(System.in)){
        String nome = scanner.nextLine();
        double sal = scanner.nextDouble();
        double vendas = scanner.nextDouble();

        System.out.printf("TOTAL = R$ %.2f%n", ((0.15*vendas)+sal));
    }
        
    }
}
