
public class Uni5Exe04 {
    public static void main(String[] args){
        double soma = 0;
        double y = 3;
        double x = 2;
        for (int cont = 1; cont <=20; cont++){
            
            soma =  y/x + soma;

            x += y+1;
            y += 2;
        }
        System.out.println("Soma = " + soma);

    }
}