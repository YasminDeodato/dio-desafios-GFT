import java.util.Scanner; 

public class Desafio_1 {
	public static void main(String[] args){
     Scanner scan = new Scanner(System.in);
  
  	 double area, raio = 0.0;
  	 
  	 //entrada de dados
  	 raio = scan.nextDouble();
    
     //calculo da area
		 area = 3.14159 * (Math.pow(raio,2));

		 System.out.printf("A=%.4f\n", area);
	}
}