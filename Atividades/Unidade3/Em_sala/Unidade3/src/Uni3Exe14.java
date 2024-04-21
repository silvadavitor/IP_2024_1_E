import java.util.Scanner;
public class Uni3Exe14{
    public static void main(String[] args) throws Exception {
       Scanner scanner = new Scanner(System.in);

       System.out.print("Distância percorrida: ");
       int distancia = scanner.nextInt();

       System.out.print("Horas gastas na distância percorrida: ");
       int tempo = scanner.nextInt();

       //calculo
        int veloMedia = distancia / tempo;
        double combustGasto = (double)distancia / 12;

    
       System.out.printf("Você manteve uma velocidade média de: " + veloMedia + " km/h e gastou %.1f litros%n", combustGasto);
       scanner.close();
    }
}
