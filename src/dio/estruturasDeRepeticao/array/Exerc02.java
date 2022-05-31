package dio.estruturasDeRepeticao.array;

/*
Faça um Programa que leia um vetor de 6 caracteres,
e diga quantas consoantes foram lidas.
Imprima as consoantes.
*/

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.Scanner;

public class Exerc02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] vetor = new String[6];

        String[] consoantes;
        int quantConsoantes = vetor.length;

        for (int i = 0; i < vetor.length; i ++){
            System.out.println("Informe a letra: ");
            String letra = scan.next();

            vetor[i]= letra;

            if (letra.equalsIgnoreCase("a") |
                    letra.equalsIgnoreCase("e") |
                    letra.equalsIgnoreCase("i") |
                    letra.equalsIgnoreCase("o") |
                    letra.equalsIgnoreCase("u") ) {
                quantConsoantes --;
            }
        }

        System.out.println("Foram lidas " + quantConsoantes+ " consoantes");
        System.out.println("Sendo elas: ");

        for (String letra : vetor) {
            if (!(letra.equalsIgnoreCase("a") |
                    letra.equalsIgnoreCase("e") |
                    letra.equalsIgnoreCase("i") |
                    letra.equalsIgnoreCase("o") |
                    letra.equalsIgnoreCase("u") )) {
                System.out.print(" " + letra);
            }
        }


    }
}
