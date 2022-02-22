import java.util.Scanner;

public class Desafio_2 {
	
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int num = 0;
        num = scanner.nextInt();
        
        for(int i=2; i<=num; i+=2) {
            System.out.println(i);
        }
    }
	
}