package desafio.gft.start3.java;

import java.util.Scanner;

public class TopN {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] TOPS = {1, 3, 5, 10, 25, 50, 100};
        int posicao = scan.nextInt();
        for(int i = 0; i < TOPS.length; i++){
            if (posicao <= TOPS[i]){
                System.out.println("Top " + TOPS[i]);
                break;
            }

        }

    }
}
