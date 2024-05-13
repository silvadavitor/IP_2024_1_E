import java.util.Scanner;
public class Uni5Exe20 {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        
        int tempo = 0;

        System.out.println("#Digite o valor da massa radiotiva em KG | Ou digite 0 para cancelar:");
        double massa = scanner.nextDouble();
        massa = massa*1000;

        while (massa >= 0.5) {
            tempo += 50;
            massa = massa/2;

           
        
        }
        System.out.println();
        System.out.println("Vai demorar " + tempo + " segundos para a massa ficar igual a  " + massa + " gramas"); 

        scanner.close();
    }
}