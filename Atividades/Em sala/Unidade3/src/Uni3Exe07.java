import java.util.Scanner;
public class Uni3Exe07{
    public static void main(String[] args) throws Exception {
       Scanner scanner = new Scanner(System.in);

       System.out.print("Quantidade de latas de 350 ml: ");
       int lata350 = scanner.nextInt();
       //calculo ml
       lata350 = lata350*350;

       System.out.print("Quantidade de garrafa de 600 ml: ");
       int garrafa600 = scanner.nextInt();
       //calculo ml
       garrafa600 = garrafa600*600;

       System.out.print("Quantidade de garrafa de 2 litros: ");
       int garrafa2L = scanner.nextInt();
       //converte litros em ml
       garrafa2L = garrafa2L*2000;
        
       //soma total
       double total = garrafa2L+garrafa600+lata350;
       
       //converte em litros
       total = total/1000;
       System.out.println("Você comprou: " + total + " litros.");
       scanner.close();
    }
}
