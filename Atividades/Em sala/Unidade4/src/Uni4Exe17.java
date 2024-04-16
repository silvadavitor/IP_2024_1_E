import java.util.Scanner;

public class Uni4Exe17 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a renda anual:");
        int rendaAnual = scanner.nextInt();
        
        System.out.println("Digite o número de dependentes:");
        int dependentes = scanner.nextInt();

        double rendaLiquida = rendaAnual - (rendaAnual * (0.02 * dependentes));
    
        if (rendaAnual > 0 && rendaAnual <= 2000){
            System.out.println("Você vai pagar R$ " + rendaLiquida);
        }
        else if (rendaAnual > 2000 && rendaAnual <= 5000) {
            rendaLiquida = rendaLiquida - (rendaLiquida * 0.05);
            System.out.println("Você vai pagar R$ " + rendaLiquida);
        }
        else if (rendaAnual > 5000 && rendaAnual <= 10000) {
            rendaLiquida = rendaLiquida - (rendaLiquida * 0.1);
            System.out.println("Você vai pagar R$ " + rendaLiquida);
        }
        else if (rendaAnual > 10000) {
            rendaLiquida = rendaLiquida - (rendaLiquida * 0.15);
            System.out.println("Você vai pagar R$ " + rendaLiquida);
        }
        else{
            System.out.println("Entrada inválida");
        }

        scanner.close();
    }
}