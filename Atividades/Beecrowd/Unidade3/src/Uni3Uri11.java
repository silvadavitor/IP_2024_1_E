import java.util.Scanner;

public class Uni3Uri11 {
    public static void main(String[] args) {
        try(Scanner scanner = new Scanner(System.in)){
            int km = scanner.nextInt();
            System.out.println((km*2)+" minutos");
        }
    }
}