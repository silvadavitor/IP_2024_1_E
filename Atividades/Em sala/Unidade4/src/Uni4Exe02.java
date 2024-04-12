import java.util.Scanner;

public class Uni4Exe02 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um valor inteiro maior que 0:");
        int numb = scanner.nextInt();

        if (numb % 2 == 0){
            System.out.println("É par");
        }else{
            System.out.println("É impar");
        }

        scanner.close();
    }
}