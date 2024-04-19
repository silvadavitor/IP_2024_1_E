import java.util.Scanner;

public class Uni4Exe27 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Horário de chegada: ");
        int hChegada = scanner.nextInt();
        int mChegada = scanner.nextInt();
        

        System.out.println("Horário de chegada: ");
        int hSaida = scanner.nextInt();
        int mSaida = scanner.nextInt();

        hChegada = hChegada * 60;
        hSaida = hSaida * 60;

        int minTotalChegada = hChegada + mChegada;
        int minTotalSaida = hSaida + mSaida;

        int minPerma = minTotalSaida - minTotalChegada;
        double valor;

        if (minPerma < 30){
            valor = 5;
            System.out.println(valor);
        }
        else if (minPerma >= 30 && minPerma <= 60) {
            valor = 5;
            System.out.println(valor);

        }
        else if (minPerma > 60 && minPerma < 90) {
            valor = 5;
            System.out.println(valor);

        }
        else if (minPerma >= 90 && minPerma <= 120) {
            valor = 10;
            System.out.println(valor);

        }
        else if (minPerma > 120 && minPerma < 150) {
            valor = 10;
            System.out.println(valor);

        }
        else if (minPerma >= 150 && minPerma <= 180) {
            valor = 22.50;
            System.out.println(valor);

            
        }
        else if (minPerma > 180 && minPerma < 210 ) {
            valor = 22.50;
            System.out.println(valor);

        }
        else if (minPerma >= 210 && minPerma <= 240) {
            valor = 30;
            System.out.println(valor);

            
        }
        else if (minPerma > 240 && minPerma < 270) {
            valor = 30;
            System.out.println(valor);

        }
        else if (minPerma >= 270 && minPerma <= 300 ){
            valor = 30;
            System.out.println(valor);

        }
        else if (minPerma > 300) {
             int horas = minPerma/60;
             int minutos = minPerma % 60;  
             if (minutos >= 30 ) {
                horas = horas + 1;
                valor = horas * 10;

                System.out.println(valor);
             }
            else{
                valor = horas * 10;
                System.out.println(valor);
            }
        }
        else{
            System.out.println("ERROR");
        }
        

        scanner.close();

    }
    }
