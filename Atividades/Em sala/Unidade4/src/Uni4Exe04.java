import java.util.Scanner;

public class Uni4Exe04 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor:");
        double numb1 = scanner.nextDouble();
        

        if (numb1 != (int) numb1){
            System.out.println("Tem casa decimal");
        }
        
        else{
            System.out.println("Não tem casa deciamal");
        }

        scanner.close();
    }
}