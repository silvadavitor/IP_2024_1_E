import java.util.Scanner;
public class Uni5Exe18 {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        double c4 = 0;
        double c5 = 0;
        double c9 = 0;
        double c12 = 0;
        double total = 0;


        System.out.println("#Digite o número do canal | Ou digite 0 para cancelar:");
        int canal = scanner.nextInt();


        while (canal != 0) {
            System.out.println("#Quantas pessoas estão assistindo:");
            double pessoas = scanner.nextDouble();
            if (canal == 4){
                c4 += pessoas;
                total += pessoas;
            }
            else if (canal == 5){
                c5 += pessoas;
                total += pessoas;
            }
            else if (canal == 9){
                c9 += pessoas;
                total += pessoas;
            }
            else if (canal == 12){
                c12 += pessoas;
                total += pessoas;
                
            }
            else{
                System.out.println("Canal invalido");
            }
        System.out.println("#Digite o número do canal de outra casa | Ou digite 0 para sair:");
        canal = scanner.nextInt();
        }
        System.out.println();
        System.out.println("Canal 4 = " + (100*c4/total) +"%");
        System.out.println("Canal 5 = " + (100*c5/total) +"%");
        System.out.println("Canal 9 = " + (100*c9/total) +"%");
        System.out.println("Canal 12 = " + (100*c12/total) +"%");

        scanner.close();
    }
}