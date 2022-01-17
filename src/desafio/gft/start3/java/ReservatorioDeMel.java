package desafio.gft.start3.java;

import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Scanner;

public class ReservatorioDeMel {

    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");
        double V, D, R, area, altura;
        double pi = 3.14;
        while (leitor.hasNext()) {
            V = leitor.nextDouble();
            D = leitor.nextDouble();
            R = D / 2;
            area = pi * (R * R);
            altura = V / area ;
            System.out.println("ALTURA = " + df.format(altura));
            System.out.println("AREA = " + df.format(area));
        }
    }

}

