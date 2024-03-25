import java.util.Scanner;

public class Uni3Uri14 {
    public static void main(String[] args) {
        try(Scanner scanner = new Scanner(System.in)){
            double valor = scanner.nextDouble();

            //Convert double para int e pega apenas o valor a frente da casa decimal
            int notas = (int) valor;

            //Pega o valor total e retira a parte de da frente da casa decimal, tudo convertido em int 
            //-> 55,30 -> 55,30 -55 = 0,30 -> 0,30*100 = 30
            int moeda = (int) ((valor - notas) * 100);

            // Notas
            int a = notas/100;
            int b = notas%100/50;
            int c = notas%100%50/20;
            int d = notas%100%50%20/10;
            int e = notas%100%50%20%10/5;
            int f = notas%100%50%20%10%5/2;
            //Moedas
            int g = notas%100%50%20%10%5%2;
            int h = moeda%100/50;
            int i = moeda%100%50/25;
            int j = moeda%100%50%25/10;
            int k = moeda%100%50%25%10/05;
            int l = moeda%100%50%25%10%05;

            System.out.println("NOTAS:");
            System.out.println(a + " nota(s) de R$ 100.00");
            System.out.println(b+ " nota(s) de R$ 50.00");
            System.out.println(c+ " nota(s) de R$ 20.00");
            System.out.println(d+ " nota(s) de R$ 10,.00");
            System.out.println(e+ " nota(s) de R$ 5.00");
            System.out.println(f+ " nota(s) de R$ 2.00");
            System.out.println("MOEDAS:");
            System.out.println(g+ " moeda(s) de R$ 1.00");
            System.out.println(h+ " moeda(s) de R$ 0.50");
            System.out.println(i+ " moeda(s) de R$ 0.25");
            System.out.println(j+ " moeda(s) de R$ 0.10");
            System.out.println(k+ " moeda(s) de R$ 0.05");
            System.out.println(l+ " moeda(s) de R$ 0.01");

        
        
        }
    }
}