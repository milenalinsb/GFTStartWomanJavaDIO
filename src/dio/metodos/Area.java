package dio.metodos;

public class Area {
    public static double calcularArea (double lado){
        return lado * lado;
    }
    public static double calcularArea (double altura, double comprimento){
        return altura * comprimento;
    }

    public static double calcularArea (double baseMaior, double baseMenor, double altura){
        return ((baseMaior + baseMenor) * altura) / 2;
    }
}
