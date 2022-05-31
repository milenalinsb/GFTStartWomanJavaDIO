package dio.estruturasDeRepeticao;

/*
Faça um programa que peça N números inteiros,
calcule e mostre a quantidade de números pares
e a quantidade de números impares.
*/

import java.util.Scanner;

public class Exerc04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int quantidade;
        System.out.println("Informa a quantidade de números que deseja informar: ");
        quantidade = scan.nextInt();
        int cont = 1;
        int quantPar = 0;
        int quantImpar = 0;

        do{
            int numero;
            System.out.println("Informe um número: ");
            numero = scan.nextInt();

            if (numero % 2 == 0){
                quantPar++;
            } else{
                quantImpar++;
            }
            cont ++;
        }while (cont <= quantidade);

        System.out.println("Foram informados " + quantidade + " números");
        System.out.println("Dentre eles, " + quantPar + " eram pares e " + quantImpar + " eram ímpares");
    }
}
