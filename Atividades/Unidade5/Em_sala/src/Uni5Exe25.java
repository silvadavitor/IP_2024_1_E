import java.util.Scanner;
public class Uni5Exe25 {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        
        
        
        int pontos = 0;
        int D = 0;
        int E = 0;
        while ((pontos != 21 && ((D-E ) < 2 || (E-D) < 2 )) || (pontos > 21 && ((D-E ) < 2 || (E-D) < 2 ))) {
            System.out.println("Quem fez o ponto: E (esquerda) ou D (direita)");
            char resp = scanner.next().charAt(0);
            
            if (resp == 'D'){
                D++;
                pontos++;
            }

            else{
               E++;
               pontos++;
            }
        
        }
        if (D > E) {
            System.out.println("Direito GANHOU com " + D + " pontos");
        }
        else{
            System.out.println("Esquerda GANHOU com " + E + " pontos");
        }
        scanner.close();
    }
}