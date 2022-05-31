package dio.estruturasDeRepeticao;

/*
Faça um programa que peça uma nota, entre zero e dez.
Mostre uma mensagem caso o valor seja inválido
e continue pedindo
até que o usuário informe um valor válido.
*/

import java.util.Scanner;

public class Exerc02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double nota;
        do {
            System.out.println("Informe a nota: ");
            nota = scan.nextDouble();
            if (nota < 0 || nota > 10) {
                System.out.println("Valor inválido, tente novamente");
                continue;
            }
        } while (nota < 0 || nota > 10);
    }
}
