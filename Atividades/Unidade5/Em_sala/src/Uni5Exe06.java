import java.util.Scanner;

public class Uni5Exe06 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        double altura = 0;
        for (int cont = 1; cont <= 20; cont++){
           System.out.println("Digita a altura da " + cont + " pessoa");
           altura += scanner.nextDouble();
           
        }
        double media = altura/20;
        System.out.println(media);
        scanner.close();
    }
}