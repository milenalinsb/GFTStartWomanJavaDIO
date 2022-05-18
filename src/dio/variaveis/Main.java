package dio.variaveis;

public class Main {
    public static void main(String[] args){

        //Tipo- nome- valor. O valor inicial é opcional
        int i = 0;

        //Variáveis com valor constante
        final int VALOR_CONSTANTE = 10;

        //Nome intuitivo
        int quantidadeProdutos = 5;

        //Tipos de dados
        byte var1 = 10;

        short var2 = 2000;

        int var3 = 5;

        long var4 = 100000000000000L;

        //float var5 = 4.5; precisa do F a frente para definir que é um numero real
        float var5 = 4.5F;

        //doble
        double var6 = 85.88;
        double var7 = 54.99D;

        char var8 = 'C';

        String var9 = "Mila"; //tipo primitivo

        boolean boo1 = true;
        boolean boo2 = false;

        //Operadores Aritméticos

        int soma = 2+2;
        int subtracao = 2-2;
        float divisao= 4 / 5;
        float multiplicacao = 2*2;

        //Incrementa
        soma ++; //adiciona 1 no valor de soma

        //Decrementa
        soma --; //subtrai 1 no valor da soma

        //Precedencia- a incrementação com o sinal na frente não é utilizado no calculo do valor da variável a

        int x = 10;
        int y = 20;
        int z = 30;

        int a = x++ + --y * z;
        // 10 + 19 * 30 = 580
        // x agora tem o valor 11, mas o valor utilizado no calculo foi 10

        int b = z / --x % 3 + 1;
        //30 / 10 % 3 + 1 = 1
        // x agora tem o valor 10

        int c = 2;

        //atribuição composta- atribui valor a variével e já realiza uma conta

        c *= x += 5;

        //10 + 5= 15 * 2 = 30


        //Conversões- casting

        //upcast- tipo menor para o maior- implícito
        //downcast- tipo maior para menor- explícito

        byte b1;
        short s1 = 1000;
        b1 = (byte) s1;
        //houve perca de informações por converter uma variável de tipo maior para um menor

        long l1;
        int i1 = 10;
        l1 = i1;
        //Atribuiu para um long um inteiro curto, dessa forma sobra espaço

        int i2;
        long l2 = 1000000000000000000L;
        i2 = (int) l2;
        //perca de informação


    }
}

