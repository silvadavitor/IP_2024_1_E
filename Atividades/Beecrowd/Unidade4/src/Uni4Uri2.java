import java.util.Scanner;

public class Uni4Uri2 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
            
        double num = scanner.nextDouble();

        if (num >= 0  && num <= 25.0000){
            System.out.println("Intervalo [0,25]");
        }
        else if (num > 25.0000  && num <= 50.0000){
            System.out.println("Intervalo (25,50]");
        }
        else if (num > 50.0000  && num <= 75.0000){
            System.out.println("Intervalo (50,75]");
        }
        else if (num > 75.0000  && num <= 100.0000){
            System.out.println("Intervalo (75,100]");
        }
        else{
            System.out.println("Fora de intervalo");
        }
        scanner.close();
        


        }
    }

