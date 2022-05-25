package dio.metodos;

public class Mensagem {
    public static void mensagemResposta(int hora){
        if (hora >= 6 && hora <= 12){
            System.out.println(bomDia());
        } else if (hora > 12 && hora <=17){
            System.out.println(boaTarde());
        } else {
            System.out.println(boaNoite());
        }

    }
    public static String bomDia(){
        return "Bom dia!";
    }
    public static String boaTarde(){
        return "Boa tarde!";
    }
    public static String boaNoite(){
        return "Boa noite!";
    }
}
