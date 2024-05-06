import java.util.Scanner;
public class Uni5Exe11 {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        
        System.out.println("Quantos dias ?");
        int n = scanner.nextInt();
        int horas = n * 16;

        int bisc = 1;
        int soma = 1;
        for (int cont = 2; cont <= horas; cont++){
            soma = soma * 3;
            bisc += soma;
 
        }
        System.out.println(bisc + " em " + n + " dias");

        scanner.close();
    }
}