import java.util.Scanner;

public class Uni5Exe33{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int cand1 = 0;
        int cand2 = 0;
        int cand3 = 0;
        int cand4 = 0;

        int nulo = 0;
        int branco = 0;
        int total = 0;

        int voto;

        do{
            System.out.println("Qual o número do candidato que você quer votar");
            System.out.println("1,2,3,4,5,6 | 0 para cancelar");
            voto = scanner.nextInt();
            System.out.println();
            switch (voto) {

                case 1:
                    System.out.println("Você votou no canditado 1");
                    cand1++;
                    total++;

                    break;
                case 2:
                    System.out.println("Você votou no canditado 2");
                    cand2++;
                    total++;
                    break;
                case 3:
                    System.out.println("Você votou no canditado 3");
                    cand3++;
                    total++;  
                    break;
                case 4:
                    System.out.println("Você votou no canditado 4");
                    cand4++;
                    total++;   
                    break;
                case 5:
                    System.out.println("Você votou nulo");
                    nulo++;
                    total++;   
                    break;
                case 6:
                    System.out.println("Você votou em branco");
                    branco++;
                    total++;    
                    break;
            
                default:
                    System.out.println("Opção invalida");
                    break;
                }
        } while (voto != 0);

        System.out.println();
        System.out.println("Total de votos do candidato 1 = " + cand1);
        System.out.println("Total de votos do candidato 2 = " + cand2);
        System.out.println("Total de votos do candidato 3 = " + cand3);
        System.out.println("Total de votos do candidato 4 = " + cand4);
        System.out.println();
        System.out.println("Total de votos do Nulo = " + nulo);
        System.out.println("Total de votos do Branco = " + branco);
        System.out.println("Percentual de votos em branco e nulo = " + ((nulo+branco)*total/100));


        scanner.close();
    }
}
    
