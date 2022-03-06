import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Desafio_3 {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(); //tamanho do tabuleiro
        int q = scanner.nextInt(); //qtd de operacoes

        int[][] M = new int[n][n];
        for(int i=0; i<n; i++)
            for(int j=0; j<n; j++)
                M[i][j] = 0;

        int tipo = 0, x = 0, r = 0;
        String saida = "";

        for(int i=0; i<q; i++) {
            tipo = scanner.nextInt();
            x = scanner.nextInt();

            if(tipo == 1 || tipo == 2) r = scanner.nextInt();

            if (tipo == 1) operacaoTipo1(M, x-1, r);
            else if (tipo == 2) operacaoTipo2(M, x-1, r);
            else if (tipo == 3) saida = saida + operacaoTipo3(M, x-1) + "\n";
            else saida = saida + operacaoTipo4(M, x-1) + "\n";
        }

        System.out.print(saida);
    }

    private static void operacaoTipo1(int[][] M, int x, int r) {
        for(int i=0; i < M.length; i++) {
            M[x][i] = r;
        }
    }

    private static void operacaoTipo2(int[][] M, int x, int r) {
        for(int i=0; i < M.length; i++) {
            M[i][x] = r;
        }
    }

    private static int operacaoTipo3(int[][] M, int x) {
        Map<Integer, Integer> frequencia = new HashMap<>();
        for(int i=0; i < M.length; i++) {
            if (!frequencia.containsKey(M[x][i])) frequencia.put(M[x][i], 1);
            else frequencia.put(M[x][i], frequencia.get(M[x][i]) + 1);
        }
        return maxElemento(frequencia);
    }

    private static int operacaoTipo4(int[][] M, int x) {
        Map<Integer, Integer> frequencia = new HashMap<>();
        for(int i=0; i < M.length; i++) {
            if (!frequencia.containsKey(M[i][x])) frequencia.put(M[i][x], 1);
            else frequencia.put(M[i][x], frequencia.get(M[i][x])+1);
        }
        return maxElemento(frequencia);
    }

    public static int maxElemento(Map<Integer, Integer> frequencia) {
        int maiorFrequencia = Collections.max(frequencia.values());
        int valorMaisFrequente = 0;
        for(Map.Entry<Integer, Integer> entry: frequencia.entrySet()) {
            if(entry.getValue().equals(maiorFrequencia)) {
                if (entry.getKey() > valorMaisFrequente) valorMaisFrequente = entry.getKey();
            }
        }

        return valorMaisFrequente;
    }


}