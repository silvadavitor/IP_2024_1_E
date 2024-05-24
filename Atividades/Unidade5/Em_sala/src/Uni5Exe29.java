import java.util.Scanner;
public class Uni5Exe29 {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);  
     
        char opc = 's';
    
        while (opc == 's') {
            System.out.println("Qual o valor?");
            int valor = scanner.nextInt();

            int a = valor/20;
            int b = valor%20/10;
            int c = valor%20%10/5;
            int d = valor%20%10%5/2;
            int e = valor%20%10%5%2;

            System.out.println(valor);
         
            System.out.println(a+ " nota(s) de R$ 20,00");
            System.out.println(b+ " nota(s) de R$ 10,00");
            System.out.println(c+ " nota(s) de R$ 5,00");
            System.out.println(d+ " nota(s) de R$ 2,00");
            System.out.println(e+ " nota(s) de R$ 1,00");
            System.out.println();

            System.out.println("Mais um valor: s (SIM) / n (NÃO)?");
            opc = scanner.next().charAt(0);
        }
      
        scanner.close();
    }
}