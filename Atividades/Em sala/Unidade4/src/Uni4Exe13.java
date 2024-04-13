import java.util.Scanner;

public class Uni4Exe13 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Carta 1:");
        int carta1 = scanner.nextInt();

        System.out.println("Carta 2:");
        int carta2 = scanner.nextInt();

        System.out.println("Carta 3:");
        int carta3 = scanner.nextInt();

        int cont = 0;

        if (carta1 == 1 || carta1 == 2 || carta1 == 3){
            cont += 1;

            if (carta2 == 1 || carta2 == 2 || carta2 == 3){ 
                cont += 1;
                
                if (carta3 == 1 || carta3 == 2 || carta3 == 3){
                    cont += 1;
                }
            }  

        }
        if (cont == 1){
            System.out.println("TRUCO PATO");
        }
        else if (cont == 2) {
            System.out.println("SEIS CAIPORA");
            
        }
        else if (cont == 3) {
            System.out.println("NOVE PELADO");

        }
        else{
            System.out.println("CORRE POLACO");
        }

        scanner.close();
    }
}