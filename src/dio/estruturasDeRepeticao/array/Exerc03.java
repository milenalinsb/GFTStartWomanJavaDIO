package dio.estruturasDeRepeticao.array;

/*
Faça um Programa que leia 20 números inteiros aleatórios (entre 0 e 100) armazene-os num vetor.
Ao final mostre os números e seus sucessores.
*/

import java.util.Random;

public class Exerc03 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] nums = new int[20];

        for(int i = 0; i < nums.length; i ++){
            int numero = random.nextInt(100);
            nums[i] = numero;
        }

        System.out.println("Array de números aleatórios gerado");
        for ( int numero: nums) {
            System.out.print (numero + " ");
        }
        System.out.println();
        System.out.println("Array dos sucessores");
        for ( int numero: nums) {
            System.out.print ((numero+1) + " ");
        }

    }
}
