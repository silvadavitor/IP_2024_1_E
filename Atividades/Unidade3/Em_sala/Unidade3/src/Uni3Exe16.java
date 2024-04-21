import java.util.Scanner;
public class Uni3Exe16{
    public static void main(String[] args) throws Exception {
       Scanner scanner = new Scanner(System.in);

       System.out.print("Valor da compra: R$ ");
       int valCompra = scanner.nextInt();

       System.out.print("Valor do pagamento: R$ ");
        int valorPag = scanner.nextInt();

       //calculo
       int troco = valorPag - valCompra;
       int cem = troco / 100;
       int dez = troco % 100 / 10;
       int um = troco % 100 % 10;

       int trocoMin = (cem + dez + um);
    
       System.out.println("O número minimo de notas é: " + trocoMin + " notas");
       System.out.println("O número de notas de 100 é: " + cem + " notas");
       System.out.println("O número de notas de 10 é: " + dez + " notas");
       System.out.println("O número de notas de 1 é: " + um + " notas");


       scanner.close();
    }
}
