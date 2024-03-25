import java.util.Scanner;
public class Uni3Exe03{
    public static void main(String[] args) throws Exception {
       Scanner scanner = new Scanner(System.in);

       System.out.print("Preço do litro da gasonlina em R$: ");
       double valorGasoLitro = scanner.nextDouble();

       System.out.print("Valor do pagamento em R$: ");
       double valorPagamento = scanner.nextDouble();

       double qntLitros = valorPagamento / valorGasoLitro;

       System.out.println("Foi colocado: " + qntLitros + " litros");
       scanner.close();
    }
}
