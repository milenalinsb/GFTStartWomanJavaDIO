package dio.metodos;

public class Emprestimo {
    //o juros depende da quantidade de parcela
    //1 a 6- 0.2
    //7 a 12- 0.3
    //13 a 18- 0.35
    //19 a 24- 0.40

    public static double getTaxaUmSeisParcelas(){
        return 0.2;
    }
    public static double getTaxaSeteDozeParcelas(){
        return 0.3;
    }
    public static double getTaxaTrezeDezoitoParcelas(){
        return 0.35;
    }
    public static double getTaxaDezenoveVinteQuatroParcelas(){
        return 0.40;
    }

    public static void calcularValorFinal(double valor, int parcelas){
        if (parcelas >=1 && parcelas <=6){
            double valorFinal = valor + (valor * getTaxaUmSeisParcelas());
            System.out.println("O valor final do empréstimo de R$" + valor + " em "+ parcelas + "parcelas fica de R$"+ valorFinal);
        } else if (parcelas >=7 && parcelas <=12){
            double valorFinal = valor + (valor * getTaxaSeteDozeParcelas());
            System.out.println("O valor final do empréstimo de R$" + valor + " em "+ parcelas + "parcelas fica de R$"+ valorFinal);
        } else if (parcelas >=13 && parcelas <=18){
            double valorFinal = valor + (valor * getTaxaTrezeDezoitoParcelas());
            System.out.println("O valor final do empréstimo de R$" + valor + " em "+ parcelas + "parcelas fica de R$"+ valorFinal);
        } else if (parcelas >=19 && parcelas <=24){
            double valorFinal = valor + (valor * getTaxaDezenoveVinteQuatroParcelas());
            System.out.println("O valor final do empréstimo de R$" + valor + " em "+ parcelas + "parcelas fica de R$"+ valorFinal);
        } else if (parcelas > 24){
            System.out.println("O empréstimo só pode ser feito com até 24 parcelas!");
        }
    }
}
