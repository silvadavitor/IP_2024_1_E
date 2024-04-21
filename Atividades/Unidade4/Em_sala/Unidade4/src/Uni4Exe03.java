import java.util.Scanner;

public class Uni4Exe03 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro valor:");
        int numb1 = scanner.nextInt();

        System.out.println("Digite o segundo valor:");
        int numb2 = scanner.nextInt();


        if (numb1 > numb2){
            System.out.println(numb1 + " é o maior");
        }
        else if (numb1 == numb2){
            System.out.println("São iguais");
        }
        else{
            System.out.println(numb2 + " é o maior");
        }

        scanner.close();
    }
}