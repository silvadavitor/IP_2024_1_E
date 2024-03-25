import java.util.Scanner;
public class Uni3Exe04{
    public static void main(String[] args) throws Exception {
       Scanner scanner = new Scanner(System.in);

       System.out.print("Primeira nota: ");
       double nota1 = scanner.nextDouble();

       System.out.print("Segunda nota: ");
       double nota2 = scanner.nextDouble();

       System.out.print("Terceira nota: ");
       double nota3 = scanner.nextDouble();

       //calculo media ponderada
       double media = ((nota1 * 5)+(nota2 * 3)+(nota3 * 2))/10;

       System.out.println("A media ponderada é: " + media);
       scanner.close();
    }
}
