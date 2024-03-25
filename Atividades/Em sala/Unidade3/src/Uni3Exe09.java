import java.util.Scanner;
public class Uni3Exe09{
    public static void main(String[] args) throws Exception {
       Scanner scanner = new Scanner(System.in);

       System.out.print("Digite o valor do raio: ");
       double raio = scanner.nextDouble();

       System.out.print("Digite o valor da altura: ");
       double altura = scanner.nextDouble();
        
       double pi = 3.1415;

       //calculo
       double volume = pi * (raio*raio) * altura;
       
       System.out.println("O volume da lata é de: " + volume);
       scanner.close();
    }
}
