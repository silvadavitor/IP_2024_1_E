import java.util.Scanner;
public class Uni5Exe30 {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        
        
        
     
        char opc = 's';
       
        
        
        while (opc == 's') {
          

            System.out.println("Mais um valor: s (SIM) / n (NÃO)?");
            opc = scanner.next().charAt(0);
        }
      
        scanner.close();
    }
}