import java.util.Scanner;

public class Uni5Exe32 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    
        System.out.print("Digite o dia da semana do primeiro dia do mês (1=Domingo, 2=Segunda,...,7=Sábado): ");
        int primDiaSem = scanner.nextInt();
    
        System.out.print("Digite o número de dias do mês: ");
        int numbDias = scanner.nextInt();
    
        System.out.println("Calendário do mês:");
        System.out.println("Dom\tSeg\tTer\tQua\tQui\tSex\tSáb");
    
        int diaAtual = 1;
    
        int i = 1;
        while (i < primDiaSem) {
            System.out.print("\t");
            i++;
        }
    
        while (diaAtual <= numbDias) {
            int diaSemana = (i - 1) % 7 + 1; 
            System.out.print(diaAtual + "\t");
    
            if (diaSemana == 7) { 
                System.out.println();
            }
    
            diaAtual++;
            i++;
        }
    
        if ((i - 1) % 7 != 0) {
            System.out.println();
        }
    
        scanner.close();
    }
}
    
