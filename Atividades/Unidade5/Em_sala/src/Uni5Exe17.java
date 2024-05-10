import java.util.Scanner;
public class Uni5Exe17 {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        double maiorA = 0;
        double menorA = 0;
        double media = 0;
        int maiorI =0;
        int menorI =0;

        int cont = 0;

        
        System.out.println("#Digite o número de inscrição do primeiro atleta | Ou digite 0 para cancelar:");
        int inscri = scanner.nextInt();


        while (inscri != 0) {
            System.out.println("#Digite a do altura do atleta:");
            double altura = scanner.nextDouble();
            if (altura >= maiorA){
                menorA = maiorA;
                menorI = maiorI;
                maiorA = altura;
                maiorI = inscri;
            }
            else if (altura <= menorA){
                menorA = altura;
                menorI = inscri;
            }
            cont++;
            media += altura;

        System.out.println("#Digite o número de inscrição do atleta | Ou digite 0 para sair:");
        inscri = scanner.nextInt();
        }

        System.out.println("O atleta com maior altura tem " + maiorA + " e a sua inscrição é o: " + maiorI);
        System.out.println("O atleta com maior altura tem " + menorA + " e a sua inscrição é o: " + menorI);
        System.out.println("E a média foi = " + (media/cont));



       
        scanner.close();
    }
}