import java.util.Scanner;

public class Uni4Exe05 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("A cor é azul?");
        boolean resp = scanner.nextBoolean();
        

        if (resp == true){
            System.out.println("Sim");
        }
        
        else{
            System.out.println("Não");
        }

        scanner.close();
    }
}