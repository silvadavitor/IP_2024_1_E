import java.util.Scanner;

public class Uni5Exe31 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
       
        System.out.println("Digite o valor:");
        int valor = scanner.nextInt();

                
        while (valor != 1) {
            System.out.println();
            if (valor%2 == 0) {
                System.out.println(valor + " = 2");
                valor = valor/2;
            } 
            else if (valor%3 == 0) {
                System.out.println(valor + " = 3");
                valor = valor/3;
            } 
            else if (valor%5 == 0) {
                System.out.println(valor + " = 5");
                valor = valor/5;
            }
            else{
                System.out.println(valor + " = " + valor);
                valor = 1;
            }
        }
        System.out.println();
        System.out.println("1 = ");

        scanner.close();
    }
}