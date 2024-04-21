import java.util.Scanner;
public class Uni3Exe02{
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual o valor do calçado?");
        double valor = scanner.nextDouble();

        double desconto = valor * 0.12;
      
        System.out.println("O valor do desconto é de R$ " + desconto);
        System.out.println("O preço do par de sapatos com desconto é R$ "+ (valor - desconto));
        scanner.close();
    }
}
