package dio.estruturasDeRepeticao;

/*
Faça um programa que calcule o fatorial de um número inteiro fornecido pelo usuário.
Ex.: 5!= 120 (5 X 4 X 3 X 2 X 1)
*/

import java.util.Scanner;

public class Exerc06 {
    public static void main(String[] args) {
        int numero;
        Scanner scan = new Scanner(System.in);
        System.out.println("Informe o numero para ver o fatorial dele: ");
        numero = scan.nextInt();
        int fatorial = 1;

        for (int i = numero; i > 0; i--){
            fatorial *= i;
        }

        System.out.println("O fatorial de " + numero + " é: "+ fatorial);
    }
}
