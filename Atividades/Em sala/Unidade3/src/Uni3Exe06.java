import java.util.Scanner;
public class Uni3Exe06{
    public static void main(String[] args) throws Exception {
       Scanner scanner = new Scanner(System.in);

       System.out.print("Peso do prato montado em KG: ");
       double pratoMontado = scanner.nextDouble();

       //Diminui preço do prato
       double pesoComida = pratoMontado - 0.750;

       double total = pesoComida * 25;

       System.out.println("O valor a pagar é de: R$ " + total);
       scanner.close();
    }
}
