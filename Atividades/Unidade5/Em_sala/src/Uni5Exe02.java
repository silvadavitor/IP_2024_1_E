
public class Uni5Exe02 {
    public static void main(String[] args){

        int somaPar = 0; int somaImpar = 0;
        
        for (int x = 0; x <=100; x++){

            if (x % 2 == 0){
                somaPar =  x + somaPar;
            }
            else{
                somaImpar = x + somaImpar;
            }
        }

        System.out.println("Soma dos pares = " + somaPar);
        System.out.println("Soma dos impares = " + somaImpar);

    }
}