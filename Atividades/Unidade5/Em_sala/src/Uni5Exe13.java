import java.util.Scanner;
public class Uni5Exe13 {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual o valor no hodometro:");
        int h = scanner.nextInt();

        System.out.println("Quantas paradas fez:");
        int parad = scanner.nextInt();
        int soma = 0;
        int soma2 = 0;


        for (int i = 1; i <= parad; i++){

            System.out.println("Quantos litros encheu nessa parada?");
            int litro = scanner.nextInt();
    
            System.out.println("Qual a KM no hodometro?");
            int hodo = scanner.nextInt();
            System.out.println();

            int k = hodo-h;
            soma += k;
            soma2 += litro;

            double qntpara = k/litro;
            System.out.println("qnt de km por litro nessa parada = " + qntpara + "km/l");


        }
        System.out.println();
        System.out.println("media de km por litro no total " + soma/soma2 + " km/l");
        scanner.close();
    }
}