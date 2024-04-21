import java.util.Scanner;
import java.util.Arrays;

public class Uni4Uri4 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
            
        int numb1 = scanner.nextInt(); 
        int numb2 = scanner.nextInt(); 
        int numb3 = scanner.nextInt();
        
        int [] numeros = new int [] {numb1, numb2, numb3};
        int [] numeroCres = new int [] {numb1, numb2, numb3};

        Arrays.sort(numeroCres);

        for (int i : numeroCres)
            System.out.println(i);

        System.out.println();

        for (int i : numeros)
            System.out.println(i);
        

        scanner.close();

        }
    }

