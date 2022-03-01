import java.io.IOException;
import java.util.Scanner;

public class Desafio_1 {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();

        for(int i=2; i<=num; i+=2)
            System.out.println(i);
    }
}
