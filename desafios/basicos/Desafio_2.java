import java.io.IOException;
import java.util.Scanner;

public class Desafio_2 {
	
    public static void main(String[] args) throws IOException {
    	Scanner leitor = new Scanner(System.in);

    	double A = leitor.nextDouble(); //valor antigo
    	double B = leitor.nextDouble(); //valor atual
    	
        double aumentoPorcento = ((B - A)/A)*100;

        System.out.printf("%.2f%%\n", aumentoPorcento);
    }
	
}