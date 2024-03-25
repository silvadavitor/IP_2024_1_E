import java.util.Scanner;

public class Uni3Uri6 {
    public static void main(String[] args){

        try (Scanner scanner = new Scanner(System.in)){
        int number = scanner.nextInt();
        int qntHora = scanner.nextInt();
        double valorHora = scanner.nextDouble();
        
        System.out.println("NUMBER = "+ (number));
        System.out.printf("SALARY = U$ %.2f%n", ((qntHora*valorHora)));
    }
        
    }
}
