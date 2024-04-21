import java.util.Scanner;

public class Uni4Exe06 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite M, F ou I");
        
        char resp = scanner.next().charAt(0);
        char upperResp = Character.toUpperCase(resp);

        if (upperResp == 'M'){
            System.out.println("Masculino");
        }
        
        else if (upperResp == 'F'){
            System.out.println("Feminino");
        }
        else if (upperResp == 'I'){
            System.out.println("Não Informado");
        }
        else{
            System.out.println("Entrada Incorreta");
        }

        scanner.close();
    }
}