import java.util.Scanner;
public class Uni5Exe16 {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        double f = 0;
        double m = 0;
        int mf = 0;
        int cont = 0;

        System.out.println("#Digite a altura\n#Ou digite 0 para sair:");
        double altura = scanner.nextDouble();

        while (altura != 0) {

            System.out.println("Escolha a opção do genero");
            System.out.println("#F\n#M\n#O");
            char gen = scanner.next().charAt(0);

            if (gen == 'F' || gen == 'f'){
                f+= altura;
                m+= altura;
                mf++;
                cont++;
            }
            else if (gen == 'M' || gen == 'm'){
                cont++;
                m+= altura;

            }
            else if (gen == 'O' || gen == 'o'){
                cont++;
                m+= altura;             
            }
    

            System.out.println("#Digite outra altura\n#Ou digite 0 para sair");

            altura = scanner.nextInt();


        }

        System.out.println(f/mf);
        System.out.println(m/cont);

       
        scanner.close();
    }
}