import java.util.Scanner;

public class Uni4Exe07 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o peso da carta em gramas:");
        
        int pCarta = scanner.nextInt();
        double valor = 0;
        if (pCarta > 50){

            pCarta = pCarta - 50;
            double qntAdd = (pCarta/20) + 1;
            valor = 0.45+ 0.45*qntAdd;

            System.out.println("Custo selo R$ " + valor);
        }
        else{
            valor = 0.45;
            System.out.println("Custo selo R$ " + valor);
        }

        scanner.close();
    }
}