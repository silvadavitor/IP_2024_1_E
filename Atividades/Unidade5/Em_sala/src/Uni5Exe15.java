import java.util.Scanner;
public class Uni5Exe15 {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        String stop = "fim";
        System.out.println("Digite o nome do aluno: ");
        String nome = scanner.next();

        // equalsIgnoreCase compara ignorando case e o ! antes serve pra dizer que é diferente
        while (!nome.equalsIgnoreCase(stop)) {
            System.out.println("Nota 1:");
            double nota1 = scanner.nextInt();
            System.out.println("Nota 2:");
            double nota2 = scanner.nextInt();
            
            System.out.println("Aluno: " + nome);
            System.out.println("media = " + ((nota1+nota2)/2));
            
            System.out.println("Digite o nome do aluno: ");
            nome = scanner.next();
        }
       
        scanner.close();
    }
}