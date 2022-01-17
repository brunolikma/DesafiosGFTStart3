package desafio.gft.start3.java;

import java.io.IOException;
import java.util.Scanner;

public class SenhaFixa {

    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        int senha = 2002;
        int V;
        while (leitor.hasNext()) {
            V = leitor.nextInt();
            if (V != senha) {
                System.out.println("Senha Invalida");
            } else {
                System.out.println("Acesso Permitido");
                break;
            }
        }
    }
}