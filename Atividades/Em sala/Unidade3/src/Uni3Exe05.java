import java.util.Scanner;
public class Uni3Exe05{
    public static void main(String[] args) throws Exception {
       Scanner scanner = new Scanner(System.in);

       System.out.print("Quantidade de frangos: ");
       double frangos = scanner.nextDouble();
       
       // Custo de 1 frango
       double custo = (4.00 + (2 * 3.50));

       // Custo total dos frangos
       double custoGranja = custo * frangos;

       System.out.println("O gasto total para marcar todos os frangos da granja é de: R$ " + custoGranja);
       scanner.close();
    }
}
