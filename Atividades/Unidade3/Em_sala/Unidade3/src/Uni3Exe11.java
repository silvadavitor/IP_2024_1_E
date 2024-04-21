import java.util.Scanner;
public class Uni3Exe11{
    public static void main(String[] args) throws Exception {
       Scanner scanner = new Scanner(System.in);

       System.out.print("Digite a temperatura em °C: ");
       double celsius = scanner.nextDouble();
        
       //calculo
       double fahrenheit = (celsius * 1.8) + 32;

       System.out.println("O valor em fahrenheit é: " + fahrenheit);
       scanner.close();
    }
}
