import java.util.Scanner;

public class Uni3Uri12 {
    public static void main(String[] args) {
        try(Scanner scanner = new Scanner(System.in)){
            int valor = scanner.nextInt();
            int a = valor/100;
            int b = valor%100/50;
            int c = valor%100%50/20;
            int d = valor%100%50%20/10;
            int e = valor%100%50%20%10/5;
            int f = valor%100%50%20%10%5/2;
            int g = valor%100%50%20%10%5%2;
            System.out.println(valor);
            System.out.println(a + " nota(s) de R$ 100,00");
            System.out.println(b+ " nota(s) de R$ 50,00");
            System.out.println(c+ " nota(s) de R$ 20,00");
            System.out.println(d+ " nota(s) de R$ 10,00");
            System.out.println(e+ " nota(s) de R$ 5,00");
            System.out.println(f+ " nota(s) de R$ 2,00");
            System.out.println(g+ " nota(s) de R$ 1,00");
        }
    }
}