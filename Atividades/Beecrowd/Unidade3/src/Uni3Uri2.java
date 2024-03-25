import java.util.Scanner;

public class Uni3Uri2 {
    public static void main(String[] args){

        try (Scanner scanner = new Scanner(System.in)){
        double raio = scanner.nextDouble();
        double circu = 3.14159 * (raio*raio);
        //System.out.println("X = "+(3.14159*(raio*raio)));
        System.out.printf("A=%.4f%n",circu);

    }
        
    }
}
