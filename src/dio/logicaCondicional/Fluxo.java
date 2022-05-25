package dio.logicaCondicional;

public class Fluxo {

    public static void meses (int numero){
        if(numero == 1){
            System.out.println("Janeiro");
            ferias();
        } else if(numero == 2){
            System.out.println("Fevereiro");
        } else if(numero == 3){
            System.out.println("Março");
        } else if(numero == 4){
            System.out.println("Abril");
        } else if(numero == 5){
            System.out.println("Maio");
        } else if(numero == 6){
            System.out.println("Junho");
        } else if(numero == 7){
            System.out.println("Julho");
            ferias();
        } else if(numero == 8){
            System.out.println("Agosto");
        } else if(numero == 9){
            System.out.println("Setembro");
        } else if(numero == 10){
            System.out.println("Outubro");
        } else if(numero == 11){
            System.out.println("Novembro");
        } else if(numero == 12) {
            System.out.println("Dezembro");
            ferias();
;        }
    }

    public static void ferias (){
        System.out.println("Férias!");
    }


    public static void diasDaSemana(int numero) {
        switch (numero) {
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda");
                break;

            case 3:
                System.out.println("Terça");
                break;

            case 4:
                System.out.println("Quarta");
                break;

            case 5:
                System.out.println("Quinta");
                break;

            case 6:
                System.out.println("Sexta");
                break;

            case 7:
                System.out.println("Sábado");
                break;
        }
    }

    public static void verificaInteiro(int numero){
        switch (numero){
            case 1 :
                System.out.println("Certo");
                break;
            case 2 :
                System.out.println("Certo");
                break;

            case 3 :
                System.out.println("Certo");
                break;

            case 4 :
                System.out.println("Errado");
                break;

            case 5 :
                System.out.println("Talvez");
                break;

        }
    }
}
