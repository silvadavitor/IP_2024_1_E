import java.util.Scanner;

public class Uni4Exe24 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Escolha uma dessas opções:\n1 - Ordem crescente\n2 - Ordem decrescente.\n3 - Maior valor no meio");
        int opcao = scanner.nextInt();

        System.out.println("Digite o primeiro valor:");
        double val1 = scanner.nextDouble();

        System.out.println("Digite segundo valor:");
        double val2 = scanner.nextDouble();

        System.out.println("Digite o terceiro valor:");
        double val3 = scanner.nextDouble();

        System.out.println("Digite o quarto valor:");
        double val4 = scanner.nextDouble();

        System.out.println("Digite quinto valor:");
        double val5 = scanner.nextDouble();


        switch (opcao) {
            case 1:
            if (val1 < val2 && val1 < val3){ 
               if (val2 < val3) {
                System.out.println(val1 + " " + val2 + " " + val3);
               }
               else{
                System.out.println(val1 +" " +val3+" "+ val2);
               }}
               
            else if (val2 < val1 && val2 < val3){ 
                if (val1 < val3) {
                 System.out.println(val2 + " " + val1 + " " + val3);
                }
                else{
                 System.out.println(val2 + " " +  val3+ " " + val1);
                }}
            else if (val3 < val1 && val3 < val2) {
                if (val1 < val2) {
                    System.out.println(val3 + " " + val1 + " " + val2);
                   }
                else{
                    System.out.println(val3 + " " +  val2+ " " + val1);
                   }
            }
            break;

        
            case 2:
            if (val1 > val2 && val1 > val3){ 
                if (val2 > val3) {
                 System.out.println(val1 + " " + val2 + " " + val3);
                }
                else{
                 System.out.println(val1 +" " +val3+" "+ val2);
                }}
             else if (val2 > val1 && val2 > val3){ 
                 if (val1 > val3) {
                  System.out.println(val2 + " " + val1 + " " + val3);
                 }
                 else{
                  System.out.println(val2 + " " +  val3+ " " + val1);
                 }}
             else if (val3 > val1 && val3 > val2) {
                 if (val1 > val2) {
                     System.out.println(val3 + " " + val1 + " " + val2);
                    }
                    else{
                     System.out.println(val3 + " " +  val2+ " " + val1);
                    }
       
                }
                break;
            case 3:
            if (val1 > val2 && val1 > val3){ 
                if (val2 > val3) {
                 System.out.println(val2 + " " + val1 + " " + val3);
                }
                else{
                 System.out.println(val3 +" " +val1+" "+ val2);
                }
             }   
             else if (val2 > val1 && val2 > val3){ 
                 if (val1 > val3) {
                  System.out.println(val1 + " " + val2 +  " " + val3);
                 }
                 else{
                  System.out.println(val3 + " " +  val2+ " " + val1);
                 }}
             else if (val3 > val1 && val3 > val2) {
                 if (val1 > val2) {
                     System.out.println(val1 + " " + val3 + " " + val2);
                    }
                    else{
                     System.out.println(val2 + " " +  val3+ " " + val1);
                    }
                }
                break;

            default:
                System.out.println("Opção inválida");
                break;
        }        

        scanner.close();
    }
}