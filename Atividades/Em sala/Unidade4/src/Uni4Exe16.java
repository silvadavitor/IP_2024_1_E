import java.util.Scanner;

public class Uni4Exe16 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite idade do primeiro homem:");
        int homem1 = scanner.nextInt();
        
        System.out.println("Digite idade do segundo homem:");
        int homem2 = scanner.nextInt();

        System.out.println("Digite idade da primeiro mulher:");
        int mulher1 = scanner.nextInt();
        
        System.out.println("Digite idade da segundo mulher:");
        int mulher2 = scanner.nextInt();
        
        int soma; int prod;
        
        if (homem1 > homem2 && mulher1 < mulher2   ){
            soma = homem1 + mulher1;
            prod = homem2 * mulher2; 
            System.out.println(soma);
            System.out.println(prod);
        }
        else if (homem1 < homem2 && mulher1 < mulher2   ){
            soma = homem2 + mulher1;
            prod = homem1 * mulher2;
            System.out.println(soma); 
            System.out.println(prod);
        }
        else if (homem1 > homem2 && mulher1 > mulher2   ){
            soma = homem1 + mulher2;
            prod = homem2 * mulher1;
            System.out.println(soma); 
            System.out.println(prod);
        }
        else if (homem1 < homem2 && mulher1 > mulher2   ){
            soma = homem2 + mulher2;
            prod = homem1 * mulher1;
            System.out.println(soma); 
            System.out.println(prod);
        }
        else{
            System.out.println("Idades iguais");
        }
        scanner.close();
    }
}