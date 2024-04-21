import java.util.Scanner;

public class Uni4Exe20 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite a primeira nota");
        int nota1 = scanner.nextInt();
        
        System.out.println("Digite a segunda nota");
        int nota2 = scanner.nextInt();
        
        System.out.println("Digite a terceira nota");
        int nota3 = scanner.nextInt();
    
        double media = (nota1 + nota2 + nota3) / 3;


        if (media < 4.0){
            System.out.println("Sua média de aproveitamento foi de " + media + " e o seu conceito foi: E. Você está REPROVADO");
        }
        else if (media >= 4.0 && media < 6.0){
            System.out.println("Sua média de aproveitamento foi de " + media + " e o seu conceito foi: D. Você está REPROVADO");
        }

        else if (media >= 6.0 && media < 7.5){
            System.out.println("Sua média de aproveitamento foi de " + media + " e o seu conceito foi: C. Você está APROVADO");
        }

        else if (media >= 7.5 && media < 9.0){
            System.out.println("Sua média de aproveitamento foi de " + media + " e o seu conceito foi: B. Você está APROVADO");
        }

        else if (media >= 9.0){
            System.out.println("Sua média de aproveitamento foi de " + media + " e o seu conceito foi: A. Você está APROVADO");
        }

        scanner.close();
    }
}