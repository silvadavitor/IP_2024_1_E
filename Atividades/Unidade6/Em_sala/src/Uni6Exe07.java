import java.util.Scanner;
public class Uni6Exe07{
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Informe um valor inteiro menor que 20");
        int valInt = scanner.nextInt();
        boolean vf = false;
        int vetor[] = new int[valInt];
        int cont = 0;

        System.out.println();

        while (true) {
            System.out.println("Informe o valor");
            int valor = scanner.nextInt();
            vf = false;
            for (int j = 0; j < vetor.length; j++){
                if (valor == vetor[j]){
                    vf = true;
                    break;
                }
            }
            if (vf){
                System.out.println("Número já existe, digite outro");
                continue;
            }
            else{
                vetor[cont] = valor;
                cont++;
            }
            if (cont == valInt) { 
                break;
            }
        }
        scanner.close();

        System.out.println("Valores no vetor antes de ordenar:");
        for (int i = 0; i < cont; i++) {
            System.out.print(vetor[i] + " ");
        }
        System.out.println();

        // ORDENAÇÃO COM BOLHA
        int k = 0;
        while (k < (vetor.length-1)) {
            if (vetor[k] > vetor[k+1]){
                int bolha = vetor[k];
                vetor[k] = vetor[k+1];
                vetor[k+1] = bolha;
                k = 0;
            }
            else{
                k++;
            }
        }

        System.out.println("Valores no vetor depois de ordenar:");
        for (int i = 0; i < cont; i++) {
            System.out.print(vetor[i] + " ");
        }
        System.out.println();
    }   
}