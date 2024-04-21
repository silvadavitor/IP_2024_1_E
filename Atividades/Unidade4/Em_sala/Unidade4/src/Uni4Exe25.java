import java.util.Scanner;

public class Uni4Exe25 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Escolha uma dessas opções:\n1 - Soma de dois números.\n2 - Diferença entre dois números.\n3 - Produto entre dois números.\n4 - Divisão entre dois números (o denominador não pode ser zero).");
        int opcao = scanner.nextInt();

        double calculo;
        System.out.println("Digite o primeiro número: ");
        double numb1 = scanner.nextDouble();

        System.out.println("Digite o segundo número: ");
        double numb2 = scanner.nextDouble();


        switch (opcao) {
            case 1:
                calculo = numb1 + numb2;
                System.out.println("Resultado: " + calculo);
                break;
        
            case 2:
                calculo = numb1 - numb2;
                System.out.println("Resultado: " + calculo);

            case 3:
                calculo = numb1 * numb2;
                System.out.println("Resultado: " + calculo);
                break;

            case 4:
                if (numb2 == 0){
                    System.out.println("Não pode ser 0 o denominador");
                }
                else{
                    calculo = numb1 / numb2;
                System.out.println("Resultado: " + calculo);
                }
                break;
           
            default:
                System.out.println("Opção inválida");
                break;
        }        

        scanner.close();
    }
}