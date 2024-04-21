import java.util.Scanner;
public class Uni3Exe12{
    public static void main(String[] args) throws Exception {
       Scanner scanner = new Scanner(System.in);

       System.out.print("Informe o seu nome: ");
       String nome = scanner.next();

       System.out.print("Informe o número de horas trabalhadas esse mês: ");
       double horasTrab = scanner.nextDouble();

       System.out.print("Informe o número de dependentes na sua família: ");
       int dependFamil = scanner.nextInt();

       //calculos salarios

       int salFamil = dependFamil * 60;
       double salTrabBruto = horasTrab * 10;

       //calculos descontos
       double inss = salTrabBruto * 0.085;
       double impostoRenda = salTrabBruto * 0.05;
       double salTrabLiquido = salTrabBruto - inss - impostoRenda;

       double totalLiquido = salTrabLiquido + salFamil;
       double totalBruto = salTrabBruto + salFamil;

       System.out.println(nome + ", o seu sálario bruto é de R$ " + totalBruto + " e o seu sálario líquido é R$ " + totalLiquido);
       scanner.close();
    }
}
