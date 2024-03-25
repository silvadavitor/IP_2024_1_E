import java.util.Scanner;
public class Uni3Exe01{
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual o comprimento do terrno?");
        double comprimento = scanner.nextDouble();
        
        System.out.println("Qual a largura do terrno?");
        double largura = scanner.nextDouble();

        //calculo da area direto no print
        System.out.println("A área do terrno é: "+(largura * comprimento));
        scanner.close();
    }
}
