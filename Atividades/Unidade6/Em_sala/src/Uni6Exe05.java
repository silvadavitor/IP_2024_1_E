import java.util.Scanner;
public class Uni6Exe05{
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        String vetorH[] = new String[5];
        String vetorM[] = new String[5];
        int indice = 0;

        System.out.println("Responda as seguintes perguntas com:\nSIM\nNAO\nIND (Indiferente)");
        System.out.println();
        System.out.println("Primeira pessoa responde: ");
        System.out.println();
    
        System.out.println("Gosta de música sertaneja?");
        vetorH[0] = scanner.next();
        System.out.println("Gosta de futebol?");
        vetorH[1] = scanner.next();
        System.out.println("Gosta de seriados?");
        vetorH[2] = scanner.next();
        System.out.println("Gosta de redes sociais?");
        vetorH[3] = scanner.next();
        System.out.println("Gosta da Oktoberfest?");
        vetorH[4] = scanner.next();

        System.out.println();

        System.out.println("Segunda pessoa responde: ");
        System.out.println();
    
        System.out.println("Gosta de música sertaneja?");
        vetorM[0] = scanner.next();
        System.out.println("Gosta de futebol?");
        vetorM[1] = scanner.next();
        System.out.println("Gosta de seriados?");
        vetorM[2] = scanner.next();
        System.out.println("Gosta de redes sociais?");
        vetorM[3] = scanner.next();
        System.out.println("Gosta da Oktoberfest?");
        vetorM[4] = scanner.next();

        System.out.println();

        for (int i = 0; i < vetorH.length; i++){
            if (vetorH[i].equals(vetorM[i])){
                indice += 3;
            }
            else if ((vetorH[i].equals("IND") && (vetorM[i].equals("SIM") || vetorM[i].equals("NAO"))) || 
                     (vetorM[i].equals("IND") && (vetorH[i].equals("SIM") || vetorH[i].equals("NAO")))){
                indice += 1;
            }
            else if ((vetorH[i].equals("SIM") && vetorM[i].equals("NAO")) || 
                     (vetorM[i].equals("SIM") && vetorH[i].equals("NAO"))){
                indice -= 2;
            }
        }
        if (indice == 15){
            System.out.println("CASEM!!");
        }
        else if (indice >= 10 && indice < 15){
            System.out.println("Vocês têm muita coisa em comum!");
        }
        else if (indice >= 5 && indice < 10){
            System.out.println("Talvez não dê certo :(");
        }
        else if (indice >= 0 && indice < 5){
            System.out.println("Vale um encontro");
        }
        else if (indice >= -9 && indice < 0){
            System.out.println("Melhor não perder tempo");
        }
        else if (indice == -10){
            System.out.println("Vocês se odeiam!");
        }
        scanner.close();
    }
}
