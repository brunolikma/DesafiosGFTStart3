package desafio.gft.start3.java;

import java.util.Scanner;

public class FasesDaLua {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int inicio = leitor.nextInt();
        int fim = leitor.nextInt();

        if (inicio >= 0 && fim <= 2) {
            System.out.println("nova");
        }
        else if (fim <=100 && inicio < fim){
            System.out.println("cheia");
        }
        else if (fim <=96 && inicio < fim) {
            System.out.println("crescente");
        }

            else {
                System.out.println("minguante");
            }

    }

}