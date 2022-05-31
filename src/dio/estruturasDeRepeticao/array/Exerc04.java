package dio.estruturasDeRepeticao.array;

/*
Gere e imprima uma matriz M 4x4 com valores aleatórios entre 0-9.
*/

import java.util.Random;

public class Exerc04 {
    public static void main(String[] args) {
        Random random = new Random();
        int[][] matriz = new int[4][4];

        for(int i = 0; i < matriz.length; i ++) {
            for (int j = 0; j < matriz[i].length; j++) {
                int numero = random.nextInt(9);
                matriz[i][j] = numero;
            }
        }

        System.out.println("Matriz 4 x 4 de números aleatórios");
        for(int i = 0; i < matriz.length; i ++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}
