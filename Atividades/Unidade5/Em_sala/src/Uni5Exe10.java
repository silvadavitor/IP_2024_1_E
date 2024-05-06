public class Uni5Exe10 {
    public static void main(String[] args){
        for (int n = 1; n <= 9999; n++){
            int part1 = n / 100;
            int part2 = n % 100;
            int soma = part1 + part2;
            if ((n) == (soma) * (soma))
            System.out.println(part1 + " + " + part2 + " = " + soma+"² = "  + n);}

}}
