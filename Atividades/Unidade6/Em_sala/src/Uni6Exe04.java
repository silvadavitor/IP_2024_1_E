import java.util.Scanner;
public class Uni6Exe04{
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        int vetorA[] = new int[10];

        int vetorB[] = new int[10];

        int vetorC[] = new int[10];

        for (int i = 0; i < vetorA.length; i++ ){

            System.out.println("Digite o numero " + (i+1) +" do vetor A" );
            vetorA[i] = scanner.nextInt();
            System.out.println("Digite o numero " + (i+1) +" do vetor B" );
            vetorB[i] = scanner.nextInt();
        }

        System.out.println();

        for (int i = 0; i < vetorA.length; i++){
            vetorC[i] = vetorA[i] + vetorB[i];
        }

        System.out.print("VetorA = ");

        for(int valores : vetorA){
			System.out.print(valores + ", ");
        }
        System.out.print("VetorB = ");

        for(int valores : vetorB){
			System.out.print(valores + ", ");
        }
        System.out.print("VetorC = ");

        for(int valores : vetorC){
			System.out.print(valores + ", ");
        }
        scanner.close();
    }
}
