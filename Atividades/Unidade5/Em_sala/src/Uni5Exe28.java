import java.util.Scanner;
public class Uni5Exe28 {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        
        
        
        int cont = 0;
        double case1 = 0;
        double case2 = 0;
        char voto = 's';
        double case3 = 0;
        double case4 = 0;
        
        
        while (voto == 's') {
            System.out.println("1 - Nenhum de Nós");
            System.out.println("2 - CPM22");
            System.out.println("3 - Skank");
            System.out.println("4 - Jota Quest");

            System.out.println();

            System.out.println("Qual o seu voto?");
            int votoQual = scanner.nextInt();

            cont++;

            switch (votoQual) {
                case 1:
                    case1++;
                    break;
                case 2:
                    case2++;

                    break;
                case 3:
                    case3++;

                    break;
                case 4:
                    case4++;

                    break;

                default:
                    System.out.println("Opção invalida");
                    break;
            }
            System.out.println();
            System.out.println("Mais um voto: s (SIM) / n (NÃO)?");
            voto = scanner.next().charAt(0);

        }
        System.out.println("Total de votos do grupo Nenhum de Nós = " + case1);
        System.out.println("Total de votos do grupo CPM22 = " + case2);
        System.out.println("Total de votos do grupo Skank = " + case3);
        System.out.println("Total de votos do grupo Jota Quest = " + case4);
        System.out.println();
        System.out.println("Porcentagem de votos do grupo Nenhum de Nós = " + (case1*100/cont) + "%");
        System.out.println("Porcentagem de votos do grupo CPM22 = " + (case2*100/cont) + "%");
        System.out.println("Porcentagem de votos do grupo Skank = " + (case3*100/cont) + "%");
        System.out.println("Porcentagem de votos do grupo Jota Quest = " + (case4*100/cont) + "%");
        

        if (case1 > case2 && case1 > case3 && case1 > case4){
            System.out.println("Nenhum de Nós CAMPEAO");
        }
        else if (case2 > case3 && case2 > case4){
            System.out.println("CPM22 CAMPEAO");
        }
        else if(case3 > case4){
            System.out.println("Skank CAMPEAO");

        }
        else{
            System.out.println("Jota Quest CAMPEAO");
        }
        scanner.close();
    }
}