package edu.dio.exercicios;

public class OperacoesBasicas {
    public String calcular(String operador, double num1, double num2) {
        String resultado;
        switch (operador) {
            case "+":
            resultado = ""+(num1+num2);
            return resultado;
            
            case "*":
            resultado = ""+(num1*num2);
            return resultado;

            case "/":
            resultado = ""+(num1/num2);
            return resultado;
            
            case "-":
            resultado = ""+(num1-num2);
            return resultado;
        
            default:
            return "Operador invalido";
        }
    }
    public String calcular(String operador, int num1, double num2) {
        String resultado;
        switch (operador) {
            case "+":
            resultado = ""+(num1+num2);
            return resultado;
            
            case "*":
            resultado = ""+(num1*num2);
            return resultado;

            case "/":
            resultado = ""+(num1/num2);
            return resultado;
            
            case "-":
            resultado = ""+(num1-num2);
            return resultado;
        
            default:
            return "Operador invalido";
        }
    }
    public String calcular(String operador, double num1, int num2) {
        String resultado;
        switch (operador) {
            case "+":
            resultado = ""+(num1+num2);
            return resultado;
            
            case "*":
            resultado = ""+(num1*num2);
            return resultado;

            case "/":
            resultado = ""+(num1/num2);
            return resultado;
            
            case "-":
            resultado = ""+(num1-num2);
            return resultado;
        
            default:
            return "Operador invalido";
        }
    }
    public String calcular(String operador, int num1, int num2) {
        String resultado;
        switch (operador) {
            case "+":
            resultado = ""+(num1+num2);
            return resultado;
            
            case "*":
            resultado = ""+(num1*num2);
            return resultado;

            case "/":
            resultado = ""+(num1/num2);
            return resultado;
            
            case "-":
            resultado = ""+(num1-num2);
            return resultado;
        
            default:
            return "Operador invalido";
        }
    }
    
}
