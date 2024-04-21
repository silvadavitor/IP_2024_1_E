import java.util.Scanner;
public class Uni3Exe08{
    public static void main(String[] args) throws Exception {
       Scanner scanner = new Scanner(System.in);

       System.out.print("Digite a quantidade de dólares recebido: ");
       double valorDolar = scanner.nextDouble();

       System.out.print("Digite a cotação do dólar: ");
       double cotacao = scanner.nextDouble();
        
       //calculo
       double valorReais = cotacao * valorDolar;
       
       System.out.println("Você deve devolver: R$ " + valorReais);
       scanner.close();
    }
}
