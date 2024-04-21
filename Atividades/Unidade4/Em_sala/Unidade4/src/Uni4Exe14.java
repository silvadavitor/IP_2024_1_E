import java.util.Scanner;

public class Uni4Exe14 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o dia:");
        int dia = scanner.nextInt();

        System.out.println("Digite o mês:");
        int mes = scanner.nextInt();

        System.out.println("Digite o ano:");
        int ano = scanner.nextInt();


        if (dia > 0 && dia < 32 && mes > 1 && mes < 13 && ano > 0){
            
            if (mes == 1 || mes == 3 || mes == 5) {
                System.out.println("Válida");
                }
            else if (mes != 2 && dia < 31){ 
                System.out.println("Válida");
                }
            else if (mes == 2 && dia < 29){
                System.out.println("Válida");
                }
            else if (dia == 29 && ano % 4 == 0 && !(ano % 100 == 0 && ano % 400 != 0)) {
                System.out.println("Válida");
                }
            else{
                System.out.println("Não é válida");
                }
            } 

        else{
            System.out.println("Não é válida");
        }
        scanner.close();
    }
}