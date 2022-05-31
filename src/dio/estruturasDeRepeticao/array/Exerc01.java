package dio.estruturasDeRepeticao.array;

/*
Crie um vetor de 6 números inteiros
e mostre-os na ordem inversa.
*/

public class Exerc01 {
    public static void main(String[] args) {
        int[] vetor = {1,5,25,7,3,6};

        for (int i = vetor.length; i > 0; i--){
            System.out.print(" " + vetor[i - 1]);
        }
    }
}
