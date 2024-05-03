import java.util.Scanner;

public class Uni5Exe08 {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        int maior = 0;
        int menor = 0;
        int posi = 0;
        int x = 0;
     
        System.out.println("Quantos números você quer comparar?");
        int n = scanner.nextInt();

        for (int cont = 1; cont <= n; cont++){

           System.out.println("Digita o " + cont + "º número");
           int numb = scanner.nextInt();
            
           if (posi >= 0 && numb > 0){
                posi+= numb;
                x++;
           }
           else if (menor == 0 && maior == 0 && numb < 0){
            menor = numb;
           }
           else if (numb < menor && numb < 0){
            menor = numb;
           }
        }
        System.out.println("Media positivo = " + posi/x);
        System.out.println("Menor número negativo = " + menor);

        scanner.close();
    }
}