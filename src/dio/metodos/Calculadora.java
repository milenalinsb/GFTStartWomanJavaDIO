package dio.metodos;

public class Calculadora {

    public static void soma (double number1, double number2){
        double resultado = number1 + number2;
        System.out.println("Soma : " + resultado);
    }

    public static void subtracao (double number1, double number2){
        double resultado = number1 - number2;
        System.out.println("Subtração : " + resultado);
    }

    public static void multiplicacao (double number1, double number2){
        double resultado = number1 * number2;
        System.out.println("Multiplicação : " + resultado);
    }

    public static void divisao (double number1, double number2){
        double resultado = number1 / number2;
        System.out.println("Divisão : " + resultado);
    }
};
