package edu.dio.collections.exercicios;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
// import java.util.List;
import java.util.Scanner;
import java.lang.System;
import java.text.DecimalFormat;



public class Exercicios {
    public static void main(String[] args) {
        
        ArrayList<Temperatura> listaDeTemperatura = new ArrayList<>();
        // List<Temperatura> temperaturas = new ArrayList<>(){{
        //     add(new Temperatura("Janeiro", 30.2));
        //     add(new Temperatura("Fevereito", 29.0));
        //     add(new Temperatura("Março", 28.5));
        //     add(new Temperatura("Abril", 28.0));
        //     add(new Temperatura("Maio", 27.7));
        //     add(new Temperatura("Junho", 25.0));
        // }};
        Scanner scanner = new Scanner(System.in);
    
    
        System.out.println("Temperatura de Janeiro");
        listaDeTemperatura.add(new Temperatura("Janeiro",scanner.nextDouble()));

        System.out.println("Temperatura de Fevereiro");
        listaDeTemperatura.add(new Temperatura("Fevereiro",scanner.nextDouble()));
        
        System.out.println("Temperatura de Março");
        listaDeTemperatura.add(new Temperatura("Março",scanner.nextDouble()));
        
        System.out.println("Temperatura de Abril");
        listaDeTemperatura.add(new Temperatura("Abril",scanner.nextDouble()));
        
        System.out.println("Temperatura de Maio");
        listaDeTemperatura.add(new Temperatura("Maio",scanner.nextDouble()));
        
        System.out.println("Temperatura de Junho");
        listaDeTemperatura.add(new Temperatura("Junho",scanner.nextDouble()));
        
        scanner.close();
            double mediaSemestral = media(listaDeTemperatura);

       System.out.println("--------------------------------------");
       DecimalFormat decimalFormat = new DecimalFormat("#.#");
       System.out.println("A média no semestre foi: " +  decimalFormat.format(mediaSemestral)+ "º");

        System.out.println("Os meses que ficaram acima da média: ");
        mostrarMaioresQueAMedia(listaDeTemperatura, mediaSemestral);
        
    }

    protected static double media(ArrayList<Temperatura> temperaturas){
        double soma = 0;
        for (Temperatura temperatura : temperaturas) {
            soma += temperatura.getTemperatura();
        }
        return soma/temperaturas.size();
    }

    protected static void mostrarMaioresQueAMedia(ArrayList<Temperatura> temperaturas, double valorMedia){
        // for (Temperatura temperatura : temperaturas) {
        //     temperatura.maiorQueAMedia(valorMedia);
        // }
        List<Temperatura> acimaMedia = new ArrayList<>();
        
        for (Temperatura temperatura : temperaturas) {
            
            if(temperatura.getTemperatura() > valorMedia) acimaMedia.add(temperatura);
        }

        acimaMedia.sort(new ComparatorTemperatura());
        Collections.reverse(acimaMedia);
        for (Temperatura temperatura : acimaMedia) {
            System.out.println(""+ temperatura.getMes() + "\t" + temperatura.getTemperatura() + "º");   
        }
    }
}
