import java.util.Scanner;

public class Uni4Exe15 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a quantidade de meses que o funcionario foi admitido:");
        int meses = scanner.nextInt();

        System.out.println("Digite o seu sálario:");
        double sal = scanner.nextDouble();


        if (meses <= 12){
            sal += 0.05 * sal;
            System.out.println("Seu reajuste foi de 5% e seu sálario foi para R$ "+ sal);
        }
        else if (meses >= 13 && meses <= 48) {
            sal += 0.07 * sal;
            System.out.println("Seu reajuste foi de 7% e seu sálario foi para R$ "+ sal);   
        }
        else{
            System.out.println("Você não recebeu reajuste");
        }
        scanner.close();
    }
}