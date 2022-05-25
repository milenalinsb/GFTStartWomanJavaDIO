package dio.metodos;

public class Main {
    public static void main(String[] args){
        System.out.println("Calculadora");
        Calculadora calculadora =  new Calculadora();
        calculadora.soma(5,2);
        calculadora.subtracao(10, 5);
        calculadora.multiplicacao(5,5);
        calculadora.divisao(30, 3);

        System.out.println("Mensagem");
        Mensagem mensagem = new Mensagem();
        mensagem.mensagemResposta(6);
        mensagem.mensagemResposta(13);
        mensagem.mensagemResposta(21);

        System.out.println("Empréstimo");
        Emprestimo emprestimo = new Emprestimo();
        emprestimo.calcularValorFinal(4000, 5);
        emprestimo.calcularValorFinal(6000, 10);
        emprestimo.calcularValorFinal(40000, 24);
        emprestimo.calcularValorFinal(3000, 25);

        System.out.println("Calculo da área de quadriláteros");
        Area area = new Area ();
        double quadrado = area.calcularArea(3);
        System.out.println("A área de um quadrado de lado 3 é: "+ quadrado);
        double retangulo = area.calcularArea(3, 5);
        System.out.println("A área de um retângulo de altura 3 e comprimento 5 é: "+ retangulo);
        double trapezio = area.calcularArea(3, 2, 3);
        System.out.println("A área de um trapézio de base maior 3, base menor 2 e altura 3 é: "+ trapezio);
    }
};

