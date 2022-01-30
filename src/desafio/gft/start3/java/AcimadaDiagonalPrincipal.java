package desafio.gft.start3.java;

import java.util.Scanner;

public class AcimadaDiagonalPrincipal {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int n = 12;
        double soma = 0, media = 0;
        char select = leitor.next().toUpperCase().charAt(0);
        double[][] M = new double[n][n];
        // preencher a matriz;
        for (int i = 0; i < n; i++) { for (int j = 0; j < n; j++) {
            M[i][j] = leitor.nextDouble();
            if (i < j ) { soma += M[i][j]; media++; } // percorrer as posições e analisar a condição de diagonal superior;
        }
        }
        // condição para impressão do resultado;
        if (select == 'M') soma = soma/media; // número de elementos = count.
        // impressão do resultado
        System.out.printf("%.1f\n",soma);
    }
}
