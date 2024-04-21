import java.util.Scanner;

public class Uni4Exe01 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
    
        System.out.println("Horas trabalhadas no mês:");
        int horasMes = scanner.nextInt();
        
        System.out.println("Valor pago por hora:");
        double horasVal = scanner.nextInt();

        double salTotal = horasMes * horasVal;

        if (horasMes > 160){
            double extraVal = (horasMes - 160) * (horasVal/2);
            salTotal = salTotal + extraVal;
            System.out.println(salTotal + " com hora extra = "+ extraVal);
        }else{
            System.out.println(salTotal);
        }

        scanner.close();
    }
}
