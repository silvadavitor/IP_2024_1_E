import java.util.Scanner;

public class Uni3Uri9 {
    public static void main(String[] args){
       try(Scanner scanner = new Scanner(System.in)){
        double A = scanner.nextDouble();double B = scanner.nextDouble();double C = scanner.nextDouble();
        System.out.printf("TRIANGULO: %.3f%n", (A*C/2));
        System.out.printf("CIRCULO: %.3f%n", (3.14159*(C*C)));
        System.out.printf("TRAPEZIO: %.3f%n", (((A+B)*C)/2));
        System.out.printf("QUADRADO: %.3f%n", (B*B));
        System.out.printf("RETANGULO: %.3f%n", (A*B));

       }
        
    }
}
