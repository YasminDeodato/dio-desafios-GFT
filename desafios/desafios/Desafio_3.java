import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;

public class Desafio_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        float mantissa = 0f;
        int expoente = 0;
        String sinalMant = "-", sinalExp = "-", zeroEsquerda = "";

        //entrada do numero
        double num = scanner.nextDouble();

        //calculo do expoente e mantissa
        if (num != 0) {
            expoente = (int) Math.floor(Math.log10(Math.abs(num)));
            mantissa = (float) (num / (Math.pow(10, expoente)));
        } else {
            if (Double.compare(num, 0.0) != -1) sinalMant = "+";
        }

        //sinais da mantissa e expoente
        if (num > 0) sinalMant = "+";
        if (expoente >= 0) sinalExp = "+";

        //para expoente com 1 algarismo signif  icativo
        if ((expoente >= 0 && expoente < 10) || (expoente > -10 && expoente <= 0))
            zeroEsquerda = "0";

        //imprimir em notacao cientifica
        System.out.printf("%s%.4fE%s%s%d\n",
                sinalMant, Math.abs(mantissa), sinalExp, zeroEsquerda, Math.abs(expoente));


    }
}

/*NumberFormat numberFormat = new DecimalFormat();
        numberFormat = new DecimalFormat("0.####E00");
        System.out.println(numberFormat.format(num));*/
//System.out.printf("%s%.f.%.4fE%s+%d", sinalMant);