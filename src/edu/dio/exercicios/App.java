package edu.dio.exercicios;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // exercicioUm();
        // exercicioDois();
        exercicioTres();
    }

    private static void exercicioUm() {
        OperacoesBasicas operacoes = new OperacoesBasicas();
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("digite o primeiro numero:");
        double num1 = scanner.nextDouble();
        System.out.println("digite o operador");
        String operador = scanner.next();
        System.out.println("digite o segundo numero:");
        double num2 = scanner.nextDouble();

        System.out.println(operacoes.calcular(operador, num1, num2));
        scanner.close();
    }
    private static void exercicioDois() {
        Saudacoes saudacoes = new Saudacoes();

        saudacoes.saudar();
    }
    private static void exercicioTres() {
        Emprestimo emprestimo = new Emprestimo();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira o valor desejado");
        double valor = scanner.nextDouble();
        System.out.println("Insira a quantidades de meses");
        int meses = scanner.nextInt();

        emprestimo.emprestar(meses, valor);

        scanner.close();
    }
}
