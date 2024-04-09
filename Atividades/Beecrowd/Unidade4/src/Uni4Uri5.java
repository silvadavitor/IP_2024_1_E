import java.util.Scanner;

public class Uni4Uri5 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
            
        int numb1 = scanner.nextInt(); 
        int numb2 = scanner.nextInt(); 
        
        if (numb1 > numb2){
            int horas = 24-(numb1 - numb2);
            System.out.printf("O JOGO DUROU %s HORA(S)%n", horas);
        }
        else if (numb1 == numb2){
            System.out.println("O JOGO DUROU 24 HORA(S)");

        }
        else{
            int horas = (numb2 - numb1);
            System.out.printf("O JOGO DUROU %s HORA(S)%n", horas);
        }
        scanner.close();

        }
    }

