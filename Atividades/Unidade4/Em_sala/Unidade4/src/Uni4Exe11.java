import java.util.Scanner;

public class Uni4Exe11 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o ano de nascimento do primeiro irmão:");
        int idade1 = scanner.nextInt()-2024;

        System.out.println("Digite o ano de nascimento do segundo irmão:");
        int idade2 = scanner.nextInt()-2024;


        System.out.println("Digite o ano de nascimento do terceiro irmão:");
        int idade3 = scanner.nextInt()-2024;

        if (idade1 == idade2 && idade2 == idade3){ 
            System.out.println("TRIGÊMEOS");
        }   
        else if (idade1 == idade2 || idade1 == idade3 || idade2 == idade3){
            System.out.println("GEMEOS");
        }
        else{
            System.out.println("APENAS IRMÃOS");
        }

        scanner.close();
    }
}