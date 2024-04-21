import java.util.Scanner;

public class Uni3Uri5 {
    public static void main(String[] args){

        try (Scanner scanner = new Scanner(System.in)){
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int C = scanner.nextInt();
        int D = scanner.nextInt();
        System.out.println("DIFERENCA = "+ ((A*B)-(C*D)));
    }
        
    }
}
