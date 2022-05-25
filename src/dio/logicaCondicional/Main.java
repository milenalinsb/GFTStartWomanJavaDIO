package dio.logicaCondicional;

public class Main {
    public static void main (String[] args){
        int num1 = 3;
        int num2 = 10;
        char char1 = 's';
        char char2 = 'b';
        String nome1 = "Milena";
        String nome2 = "Pedro";
        boolean boo1 = true;
        boolean boo2 = false;

        System.out.println("Inteiros: "+ num1 + " e " + num2);
        System.out.println("Similaridade inteiros- comparação igual-> " + (num1 == num2));
        System.out.println("Similaridade inteiros-> comparação diferente " + (num1 != num2));
        System.out.println("Tamanho inteiros-> comparação maior " + (num1 > num2));
        System.out.println("Tamanho inteiros-> comparação menor " + (num1 < num2));

        System.out.println("Char: "+ char1 + " e " + char2);
        System.out.println("Similaridade char- comparação igual-> " + (char1 == char2));
        System.out.println("Similaridade char-> comparação diferente " + (char1 != char2));
        System.out.println("Tamanho char-> comparação maior " + (char1 > char2));
        System.out.println("Tamanho char-> comparação menor " + (char1 < char2));

        System.out.println("String: "+ nome1 + " e " + nome2);
        System.out.println("Similaridade String- comparação igual-> " + (nome1 == nome2));
        System.out.println("Similaridade String-> comparação diferente " + (nome1 != nome2));

        System.out.println("Boolean: "+ boo1 + " e " + boo2);
        System.out.println("Similaridade boolean- comparação igual-> " + (boo1 == boo2));
        System.out.println("Similaridade boolean-> comparação diferente " + (boo1 != boo2));

        boolean true1 = true;
        boolean true2 = true;
        boolean false1 = false;
        boolean false2 = false;
        System.out.println("Operadores lógicos");
        System.out.println("true1 && true2 "+ (true1 && true2));
        System.out.println("true1 && false1 "+ (true1 && false1));
        System.out.println("false1 && false2 "+ (false1 && false2));
        System.out.println("true1 || true2 "+ (true1 || true2));
        System.out.println("true1 || false1 "+ (true1 || false1));
        System.out.println("false1 || false2 "+ (false1 || false2));
        System.out.println("true1 ^ true2 "+ (true1 ^ true2));
        System.out.println("true1 ^ false1 "+ (true1 ^ false1));
        System.out.println("false1 ^ false2 "+ (false1 ^ false2));

        System.out.println("Fluxo com If- Meses do ano");
        Fluxo fluxo = new Fluxo();
        fluxo.meses(1);
        fluxo.meses(7);
        fluxo.meses(9);

        System.out.println("Fluxo com Switch- Dias da semana");
        fluxo.diasDaSemana(2);
        fluxo.diasDaSemana(3);
        fluxo.diasDaSemana(7);

        System.out.println("Fluxo com Switch- Verificando inteiro");
        fluxo.verificaInteiro(2);
        fluxo.verificaInteiro(4);
        fluxo.verificaInteiro(5);



    }
}
