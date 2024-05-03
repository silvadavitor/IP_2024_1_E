import java.util.Scanner;

public class Uni5Exe07 {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        int maior = 0;
        int menor = 0;

        System.out.println("Quantos números você quer comparar?");
        int n = scanner.nextInt();

        for (int cont = 1; cont <= n; cont++){

           System.out.println("Digita o " + cont + "º número");
           int numb = scanner.nextInt();
            
           if (maior == 0 && menor == 0 ){
                maior = numb;
                menor = numb;
                
           }
           else if (numb < menor){
            menor = numb;
           }
           else if (numb > maior){
            maior = numb;
           }
          
        }
        System.out.println("Maior número = " + maior);
        System.out.println("Menor número = " + menor);

        scanner.close();
    }
}