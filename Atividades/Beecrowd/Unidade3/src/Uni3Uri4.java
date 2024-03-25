import java.util.Scanner;

public class Uni3Uri4 {
    public static void main(String[] args){

        try (Scanner scanner = new Scanner(System.in)){
        double notaA = scanner.nextDouble();
        double notaB = scanner.nextDouble();
        //Media ponderada = atribui um peso à nota e divida pela soma dos pesos
        double media = (((notaA*3.5)+(notaB*7.5))/11);
        System.out.printf("MEDIA = %.5f%n", media);
    }
        
    }
}
