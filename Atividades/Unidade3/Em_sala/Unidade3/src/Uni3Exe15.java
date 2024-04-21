import java.util.Scanner;
public class Uni3Exe15{
    public static void main(String[] args) throws Exception {
       Scanner scanner = new Scanner(System.in);

       System.out.print("Número inteiro com até 3 dígitos: ");
       int numero = scanner.nextInt();

       //calculo
       int centena = numero / 100;
       int dezena = numero % 100 / 10;
       int unidade = numero % 100 % 10;

    
       System.out.println(centena + " centena(s) " + dezena + " dezena(s) " + unidade + " unidade(s)");
       scanner.close();
    }
}
