package edu.dio.exercicios;

import java.util.Calendar;

public class Saudacoes {
    public void saudar() {
        Calendar data = Calendar.getInstance();
        int horaAtual = data.get(Calendar.HOUR_OF_DAY);

        if (horaAtual >= 5 & horaAtual<12) {
            System.out.println("Bom dia!");
        } else if(horaAtual >=12 & horaAtual < 18){
            System.out.println("Boa tarde!");
        } else{
            System.out.println("Boa noite!");
        }
    }
}
