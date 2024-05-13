import java.util.Scanner;
public class Uni5Exe19 {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        
        double descontoT = 0;

        System.out.println("#Digite o valor da compra | Ou digite 0 para cancelar:");
        double valor = scanner.nextDouble();


        while (valor != 0) {
            
            if (valor > 500){
                double desconto = valor - (valor*0.2);
                System.out.println();
                System.out.println("Valor da compra é de R$ " + (desconto));
                descontoT += desconto;
            }
            else {
                double desconto = valor - (valor * 0.15);
                System.out.println();
                System.out.println("Valor da compra é de R$ " + (desconto));
                descontoT += desconto;

            }
           
        System.out.println("#Digite o valor da outra compra | Ou digite 0 para sair:");
        valor = scanner.nextDouble();
        }
        System.out.println();
        System.out.println("A loja faturou R$ " + (descontoT) +" no final do dia");

        scanner.close();
    }
}