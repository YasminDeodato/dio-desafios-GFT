import java.util.Scanner;

public class Desafio_2B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double N, nota, moeda;
        int quociente, resto;

        double[] notasDisponiveis = {100, 50, 20, 10, 5, 2};
        double[] moedasDisponiveis = {1, 0.5, 0.25, 0.1, 0.05, 0.01};

        N = sc.nextDouble();

        resto = (int) (N * 100.0);

        System.out.println("NOTAS:");
        for(int i=0; i<notasDisponiveis.length; i++) {
            nota = notasDisponiveis[i];
            quociente = (int) (resto / (nota*100));
            System.out.printf("%d nota(s) de R$ %.0f.00\n", quociente, nota);
            resto = (int) (resto % (nota*100));
        }

        System.out.println("MOEDAS:");
        for(int i=0; i<moedasDisponiveis.length; i++) {
            moeda = moedasDisponiveis[i];
            quociente = (int) (resto / (moeda * 100));
            System.out.printf("%d moeda(s) de R$ %.2f\n", quociente, moeda);
            resto = (int) (resto % (moeda*100));
        }
    }
}
