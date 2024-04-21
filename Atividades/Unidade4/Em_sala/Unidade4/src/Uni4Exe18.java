import java.util.Scanner;

public class Uni4Exe18 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int vencimento = 10;
        
        System.out.println("Qual o dia do pagamento:");
        int pagamento = scanner.nextInt();

        System.out.println("Digite o valor da prestação:");
        double presta = scanner.nextDouble();

        if (pagamento > 0 && pagamento <= vencimento){
            presta = presta - (presta * 0.1);
            System.out.println("Você vai pagar R$ " + presta);
        }
        else if (pagamento > vencimento && pagamento <= (vencimento+5)) {
            System.out.println("Você vai pagar R$ " + presta);
        }
        else if (pagamento > (vencimento+5) && pagamento <= 31) {
            presta = presta + (presta * ((pagamento-vencimento) * 0.02));
            System.out.println("Você vai pagar R$ " + presta);
        }
        else{
            System.out.println("Entrada inválida");
        }
    
        scanner.close();
    }
}