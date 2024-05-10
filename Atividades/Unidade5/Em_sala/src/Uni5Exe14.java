import java.util.Scanner;
public class Uni5Exe14 {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);


        int totalC = 0;
        int totalV = 0;
        int qnt = 0;
        int qnt10 = 0;
        int qnt20 = 0;

        for (int i = 1; i <= 2; i++){

            System.out.println("Qual o nome do " + i + "º produto");
            String nome = scanner.next();
    
            System.out.println("Qual o preço compra do " + i + "º produto");
            int pc = scanner.nextInt();

            System.out.println("Qual o preço venda do " + i + "º produto");
            int pv = scanner.nextInt();

            double porcent = (pv - pc) / pc * 100;

            System.out.println();
            System.out.println("Produto: " + nome);
            System.out.println("Preço compra R$ " + pc);
            System.out.println("Preço venda R$ " + pv);
            System.out.println();
            
            if (porcent < 10){
                qnt++;
            }
            else if (porcent >= 10 && porcent <= 20){
                qnt10++;
            }
            else{
                qnt20++;
            }
            totalC += pc;
            totalV += pv;
        }
        System.out.println();
        System.out.println("menor 10 = " + qnt);
        System.out.println("de 10 a 20 = " + qnt10);
        System.out.println("maior 20 = " + qnt20);

        System.out.println();
        System.out.println("Total compra = " + totalC);
        System.out.println("Total venda = " + totalV);
        System.out.println("Lucro total = " + (totalV-totalC));
        scanner.close();
    }
}