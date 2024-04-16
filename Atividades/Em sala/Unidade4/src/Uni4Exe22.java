import java.util.Scanner;

public class Uni4Exe22 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite a sua opção\n1 - Ciência da Computação\n2 - Licenciatura da Computação\n3 - Sistemas de Informação");
        int opcao = scanner.nextInt();

        switch (opcao) {
            case 1:
                System.out.println("Bacharel em Ciência da Computação");
                break;
        
            case 2:
                System.out.println("Licenciatura em Computação");
                break;

            case 3:
                System.out.println("Bacharel em Sistemas de Informação");
                break;
            default:
                System.out.println("Faz nada");
                break;
        }        

        scanner.close();
    }
}