package dio.estruturasDeRepeticao;

/*
Faça um programa que leia 5 números
e informe o maior número
e a média desses números.
*/

import java.util.Scanner;

public class Exerc03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int cont = 1;
        int maior = 0;
        int soma= 0;

        do{
            int numero;
            System.out.println("Informe um número: ");
            numero = scan.nextInt();
            if (numero > maior){
                maior = numero;
            }
            soma += numero;
            cont ++;
        }while (cont <= 5);

        System.out.println("O maior número é: "+ maior);
        System.out.println("A média dos números informados é: "+ soma/5);
    }
}
