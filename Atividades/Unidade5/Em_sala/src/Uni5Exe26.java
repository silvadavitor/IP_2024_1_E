import java.util.Scanner;
public class Uni5Exe26 {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        
        
        
        int cont = 0;
        int acima150 = 0;
        int acimaDoNeaga = 0;

        System.out.println("Valor máximo do pedágio:");
        double valorIni = scanner.nextDouble();
        System.out.println();
        System.out.println("Qual o valor do proximo pedágio e a distancia, respectivamente");
        double valorOutro = scanner.nextDouble(); double dist = scanner.nextDouble();

        while (valorOutro >= 0) {

            if (valorOutro > valorIni){
                acimaDoNeaga++;
            }
            if (dist > 150 && valorOutro <= valorIni) {
                acima150++;
            }   
            cont++;
            System.out.println("Qual o valor do proximo pedágio e a distancia, respectivamente");
            valorOutro = scanner.nextDouble(); dist = scanner.nextDouble();
       
        }

        System.out.println();
        System.out.println(acimaDoNeaga +  " (trechos com valor acima do qual ele nega-se a pagar);");
        System.out.println(cont + "(quantidade de trechos informados);");
        System.out.println(acima150 +  " (trechos acima de 150km com valor aceito por ele).");
        

        scanner.close();
    }
}