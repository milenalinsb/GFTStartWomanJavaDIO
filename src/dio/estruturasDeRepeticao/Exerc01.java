package dio.estruturasDeRepeticao;

import java.util.Scanner;

/*
Faça um programa que leia conjuntos de dois valores,
o primeiro representando o nome do aluno e o segundo representando a sua idade.
(Pare o programa inserindo o valor 0 no campo nome)
*/

public class Exerc01 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String nome;
        int idade;
        do{
            System.out.println("Informe o nome: ");
            nome = scan.next();
            if (nome.equals("0")){
                System.out.println("Interrompido");
                break;
            }
            System.out.println("Informe a idade: ");
            idade = scan.nextInt();
        } while (true);


    }
}
