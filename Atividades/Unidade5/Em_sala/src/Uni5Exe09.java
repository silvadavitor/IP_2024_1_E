import java.util.Scanner;
import java.util.ArrayList;
public class Uni5Exe09 {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        
        int x = 0;
        ArrayList<String> lista = new ArrayList<>();

        System.out.println("Quantos alunos a turma tem?");
        int n = scanner.nextInt();

        for (int cont = 1; cont <= n; cont++){

           System.out.println("Digita o nome do aluno");
           String name = scanner.next();

           System.out.println("Digita a idade do aluno");
           int idade = scanner.nextInt();
            
           if (idade == 18 ){
                lista.add(name);
           }
           else if (idade > 20){
                x++;
           }
        }
        System.out.println("");
        for (String i : lista){
            System.out.println(i);
            
        }
        System.out.println("");
        System.out.println("Possui " + x + " alunos acima dos 20 anos");

        scanner.close();
    }
}