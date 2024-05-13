import java.util.Scanner;
public class Uni5Exe24 {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Deseja informar o peso do peixe: s (SIM) / n (NÃO)?”.");
        char resp = scanner.next().charAt(0);
        
        System.out.println("Qual o limite diário em kg?");
        int limite = scanner.nextInt();

        double total = 0;
        while ( resp != 'n') {
            System.out.println("Qual o peso desse peixe em gramas?");
            double peso = scanner.nextDouble();
            peso = peso/1000;
            System.out.println();
            total += peso;
            
            if (total > limite){
                System.out.println("Excedeu o limite diário");
                resp = 'n';
            }
            else{
                System.out.println("Total até agora é de " + total + " kg");
                System.out.println();
                System.out.println("Deseja informar o peso de mais um peixe: s (SIM) / n (NÃO)?");
                resp = scanner.next().charAt(0);
            }
        
        }
        if (total > limite) {
            System.out.println("No final o total foi de " + limite + " kg");
        }
        else{
            System.out.println("No final o total foi de " + total + " kg");
        }
        scanner.close();
    }
}