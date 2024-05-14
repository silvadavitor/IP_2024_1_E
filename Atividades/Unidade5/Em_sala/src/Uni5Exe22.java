import java.util.Scanner;
public class Uni5Exe22 {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        
        double salario = 2000;
        double aumento = 0.015;
        int data = 1996;

        while ( data <= 2024) {
            salario = salario + (salario*aumento);
            System.out.println("A porcentagem é = " + (aumento*100) + "% e o sálario foi " + salario);

            aumento = aumento*2;  
            data++;

        }
        System.out.println();
        System.out.println("Salario final = R$ " + aumento + " atualmente em 2024"); 
        scanner.close();
    }
}