import java.util.Scanner;

public class Uni3Uri10 {
    public static void main(String[] args) {
        try(Scanner scanner= new Scanner(System.in)){
        double x1 = scanner.nextDouble();double y1 = scanner.nextDouble();
        double x2 = scanner.nextDouble();double y2 = scanner.nextDouble();
        double dist = Math.sqrt(((x2-x1)*(x2-x1))+((y2-y1)*(y2-y1)));
        System.out.printf("%.4f%n",dist);
        }
    }
}