import java.util.Scanner;
public class Uni5Exe27 {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        
        
        
        int qntM = 0;
        int qntT = 0;
        int totalT = 0;
        int func = 1;
        int maiorDia = 0;
        int maiorProd = 0;
        
        while (func == 1) {
            System.out.println("Digite o dia:");
            int dia = scanner.nextInt();

            while (dia < 0 || dia > 31 ) {
                System.out.println("Dia inválido");
                System.out.println();
                System.out.println("Qual o dia de abril?");
                dia = scanner.nextInt();
            }
            System.out.println("Total de peças produzidas no turno da manhã:");
            qntM = scanner.nextInt();

            System.out.println("Total de peças produzidas no turno da tarde:");
            qntT = scanner.nextInt();
            totalT = qntT + qntM;
            if (totalT > maiorProd);{
                maiorProd = totalT;
                maiorDia = dia;
            }
            double valor = 0;
            if (dia > 0 && dia < 16) {
                if (totalT > 100 && qntM >= 30 && qntT >= 30) {
                    valor = totalT * 0.80;
                }
                else{
                    valor = totalT * 0.50;
                }
                System.out.println("R$ " + valor +  " (valor recebido)");
            }
            else{
                valor = (qntM * 0.40) + (qntT * 0.30);
                System.out.println("R$ " + valor +  " (valor recebido)");
            }


            if (qntM > qntT) {
                System.out.println("O funcionario produz mais de manhã");
                System.out.println("Produziu = " + qntM);
            }
            else if (qntT > qntM) {
                System.out.println("O funcionario produz mais de tarde");
                System.out.println("Produziu = " + qntT);
            }
            else{
                System.out.println("O funcionario produz igualmente nos periodos");
            }
            System.out.println();
            System.out.println("Novo funcionário: (1.sim 2.não)?");
            func = scanner.nextInt();
        }
        System.out.println("O maior dia de produção foi dia " + maiorDia);

        scanner.close();
    }
}