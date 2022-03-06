import java.io.IOException;
import java.util.Scanner;

public class Desafio_1 {
    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        double soma = 0;
        char O = leitor.next().toUpperCase().charAt(0);
        String elementos = "";
        double[][] M = new double[12][12];
        for (int i=0; i<12; i++) {
            for (int j=0; j<12; j++) {
                M[i][j] = leitor.nextDouble();
            }
        }

        for (int i=1; i<11; i++) {
            for (int j=11; j>11-(11-i); j--) {
                if (i+j >= 12) {
                    soma += M[i][j];
                    elementos = elementos + "M[" + i + "][" + j + "] ";
                }
            }
            elementos = elementos + "\n";
        }

        if (O == 'M') soma /= 30;
        System.out.println(String.format("%.1f", soma));
        System.out.println("Elementos:\n" + elementos);
    }
}
