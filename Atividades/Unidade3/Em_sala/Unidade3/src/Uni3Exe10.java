import java.util.Scanner;
public class Uni3Exe10{
    public static void main(String[] args) throws Exception {
       Scanner scanner = new Scanner(System.in);

       System.out.print("Comprimento do primeiro cateto: ");
       double cateto1 = scanner.nextDouble();

       System.out.print("Comprimento do segundo cateto: ");
       double cateto2 = scanner.nextDouble();
        
       //calculo
       double hipotenusa = (cateto2*cateto2)+(cateto1*cateto1);
       hipotenusa = Math.sqrt(hipotenusa);

       System.out.println("O valor do comprimento da hipotenusa é: " + hipotenusa);
       scanner.close();
    }
}
