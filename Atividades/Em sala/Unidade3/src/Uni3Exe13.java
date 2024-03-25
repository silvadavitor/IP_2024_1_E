import java.util.Scanner;
public class Uni3Exe13{
    public static void main(String[] args) throws Exception {
       Scanner scanner = new Scanner(System.in);

       System.out.print("Altura parede em metros: ");
       double altura = scanner.nextDouble();

       System.out.print("Comprimento parede em metros: ");
       double comprimento = scanner.nextDouble();

       //calculo
       double area = altura * comprimento;
       int azulejoMetroQua = 9;
       double valorAzulejo = 12.50;
       double qntAzulejo = area * azulejoMetroQua;
       
       double valorTotal = qntAzulejo * valorAzulejo;

    
       System.out.println("Você gastará: R$ " + valorTotal);
       scanner.close();
    }
}
