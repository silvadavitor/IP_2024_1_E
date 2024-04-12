import java.util.Scanner;

public class Uni4Exe10 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a idade do Marquinhos:");
        int idade1 = scanner.nextInt();

        System.out.println("Digite a idade do Zezinho:");
        int idade2 = scanner.nextInt();


        System.out.println("Digite a idade da Luluzinha:");
        int idade3 = scanner.nextInt();

        if (idade1 < idade2 && idade1 < idade3){ 
            System.out.println("Marquinhos é o caçula");
        }   
        else if (idade2 < idade3){
            System.out.println("Zezinho é o caçula");
        }
        else{
            System.out.println("Luluzinha é a caçula");
        }

        scanner.close();
    }
}