import java.util.Scanner;

public class Uni3Uri3 {
    public static void main(String[] args){

        try (Scanner scanner = new Scanner(System.in)){
        int valor1 = scanner.nextInt();
        int valor2 = scanner.nextInt();
        System.out.println("PROD = "+(valor1*valor2));
    }
        
    }
}
