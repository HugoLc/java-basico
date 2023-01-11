package edu.dio.exercicios;

public class Emprestimo {
    double jurosPorMes = 0.05;
    
    public void emprestar(int qtdMeses, double valor) {
        double valorFinal = valor + valor * jurosPorMes * qtdMeses;

        System.out.println("O valor solicitado foi: " + valor);
        System.out.println("A taxa de juros é de "+ jurosPorMes*100 + "% ao mês");
        System.out.println("O valor a ser pago é: " + valorFinal + " em parcelas de " + valorFinal / qtdMeses);
    }
    
}
