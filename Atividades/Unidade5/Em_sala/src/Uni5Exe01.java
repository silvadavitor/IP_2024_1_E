import java.util.Scanner;

public class Uni5Exe01 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
       
        for (int x = 1; x <=20; x++){

            System.out.println("Digitre o número: ");
            int numb = scanner.nextInt();

            if (numb % 2 == 0){
                System.out.println(numb + " = Par");
            }
            else{
                System.out.println(numb + " = Impar");
            }
        }
        scanner.close();
    }
}