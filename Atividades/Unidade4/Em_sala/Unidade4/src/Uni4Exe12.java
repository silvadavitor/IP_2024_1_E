import java.util.Scanner;

public class Uni4Exe12 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Valor do lado 1:");
        int lado1 = scanner.nextInt();

        System.out.println("Valor do lado 2:");
        int lado2 = scanner.nextInt();

        System.out.println("Valor do lado 3:");
        int lado3 = scanner.nextInt();

        if (lado1 < (lado2+lado3) && lado2 < (lado1+lado3) && lado3 < (lado1+lado2)){
            
            if (lado1 == lado2 && lado2 == lado3){ 
                System.out.println("Equilátero");
            }   
            else if (lado1 == lado2 ||lado1 == lado3 || lado2 == lado3){
                System.out.println("Isóceles");
            }
            else{
                System.out.println("Escaleno");
            }
        }
        
        else{
            System.out.println("Não é triangulo");
        }

        scanner.close();
    }
}