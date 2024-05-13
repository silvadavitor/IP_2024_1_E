import java.util.Scanner;
public class Uni5Exe23 {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Deseja Cadastrar um vendedor: s (SIM) / n (NÃO)?");
        char resp = scanner.next().charAt(0);
        
        double total = 0;

        while ( resp != 'n') {
            System.out.println("Qual o nome do vendedor?");
            String nome = scanner.next();
            System.out.println();

            System.out.println("Qual o número de produtos?");
            int prod = scanner.nextInt();
            int cont = 1;
            int salario = 0;

            while (cont <= prod) {
                System.out.println("Digite o valor do " + cont + " prduto:");
                double valor = scanner.nextDouble();
                System.out.println();

                System.out.println("Digite a quantidade do produto:");
                int qnt = scanner.nextInt();

                salario += qnt*valor;
                cont++;

            }
            total += salario;
            System.out.println();
            System.out.println("O vendedor " + nome + " teve o salário de R$ " + salario);
            System.out.println("Total vendido até agora foi R$ " + total);
            System.out.println();
            System.out.println("Deseja digitar os dados de mais um vendedor: s (SIM) / n (NÃO)?");
            resp = scanner.next().charAt(0);
        
        }
        scanner.close();
    }
}