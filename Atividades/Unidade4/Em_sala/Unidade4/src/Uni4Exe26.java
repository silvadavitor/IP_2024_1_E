import java.util.Scanner;

public class Uni4Exe26 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Escolha uma dessas opções:\nT: calcular a área de um triângulo de base b e altura h\nQ: calcular a área de um quadrado de lado l\nR: calcular a área de um retângulo de base b e altura h\nC: calcular a área de um círculo de raio r");
        char opcao = scanner.next().charAt(0);
        
        opcao = Character.toUpperCase(opcao);
        double calculo;
        
        switch (opcao) {
            case 'T':
                System.out.println("Digite a base do traingulo: ");
                double base = scanner.nextDouble();

                System.out.println("Digite a altura do triangulo: ");
                double altura = scanner.nextDouble();

                calculo = base * altura/2;
                System.out.println("Resultado: " + calculo);
                break;
        
            case 'Q':
                System.out.println("Digite o lado: ");
                double lado = scanner.nextDouble();

                calculo = lado * lado;
                System.out.println("Resultado: " + calculo);
                break;

            case 'R':
                System.out.println("Digite a base do retangulo: ");
                double b = scanner.nextDouble();

                System.out.println("Digite a altura do retangulo: ");
                double h = scanner.nextDouble();
            
                calculo = b * h;
                System.out.println("Resultado: " + calculo);
                break;

            case 'C':
                System.out.println("Digite o raio: ");
                double r = scanner.nextDouble();
            
                calculo = Math.PI * Math.pow(r, 2);
                System.out.println("Resultado: " + calculo);
                break;
           
            default:
                System.out.println("Opção inválida");
                break;
        }        

        scanner.close();
    }
}