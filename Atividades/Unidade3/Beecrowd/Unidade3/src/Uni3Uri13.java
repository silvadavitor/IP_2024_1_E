import java.util.Scanner;

public class Uni3Uri13 {
    public static void main(String[] args) {
    try(Scanner scanner = new Scanner(System.in)){
        int numero = scanner.nextInt();
        int hora = numero/3600;
        int min = numero%3600/60;
        int seg = numero%3600%60;
        System.out.println(hora+":"+min+":"+seg);
        }
    }
   

}