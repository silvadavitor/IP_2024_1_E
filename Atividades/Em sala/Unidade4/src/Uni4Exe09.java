import java.util.Scanner;

public class Uni4Exe09 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro número:");
        int numb1 = scanner.nextInt();

        System.out.println("Digite o segundo número:");
        int numb2 = scanner.nextInt();


        if (numb1 % numb2 == 0 || numb2 % numb1 ==0){ 
            System.out.println("É multiplo");
        }   
        else{
            System.out.println("NÃO é multiplo");
        }

        scanner.close();
    }
}