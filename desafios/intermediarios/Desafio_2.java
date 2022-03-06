import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Desafio_2 {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        char tipo;
        int quantia = 0, total = 0;
        Map<Character, Integer> cobaias = new HashMap<>(){{
            put('C', 0);
            put('R', 0);
            put('S', 0);
        }};
        int n = input.nextInt();

        for(int i=0; i<n; i++) {
            quantia = input.nextInt();
            tipo = input.next().charAt(0);

            cobaias.put(tipo, cobaias.get(tipo) + quantia);
            total += quantia;
        }

        System.out.println("Total: " + total + " cobaias");
        System.out.println("Total de coelhos: " + cobaias.get('C'));
        System.out.println("Total de ratos: " + cobaias.get('R'));
        System.out.println("Total de sapos: " + cobaias.get('S'));
        System.out.printf("Percentual de coelhos: %.2f %%\n", ((float) cobaias.get('C')/total)*100);
        System.out.printf("Percentual de ratos: %.2f %%\n", ((float) cobaias.get('R')/total)*100);
        System.out.printf("Percentual de sapos: %.2f %%\n", ((float) cobaias.get('S')/total)*100);
    }
}
