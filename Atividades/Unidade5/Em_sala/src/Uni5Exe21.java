import java.util.Scanner;
public class Uni5Exe21 {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        
        double chico = 1.50;
        double ze = 1.10;
        int anos = 0;

        while ( ze < chico) {
            anos++;
            ze += 0.03;
            chico += 0.02;
           
        
        }
        System.out.println();
        System.out.println("Vai demorar " + anos + " anos para Zé ultrapasar Chico"); 
        System.out.println("Altura final\nChico = " + chico+"\nZé = " + ze);
        scanner.close();
    }
}