import java.util.Scanner;
public class Uni5Exe12 {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        
        System.out.println("Quantos linhas?");
        int n = scanner.nextInt();
        int numb = 1;
        for (int j = 1; j <= n; j++){
            for (int i = 1; i <= j; i++){
                System.out.print(numb+ " ");
                numb++;
            }
            System.out.println();
        }

        scanner.close();
    }
}