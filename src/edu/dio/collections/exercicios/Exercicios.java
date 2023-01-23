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
        
        Scanner scanner = new Scanner(System.in);
        boolean sair = false;
        
        while(!sair){

            System.out.println("\n\n############################");
            System.out.println("Qual exercício deseja acessar?");
            System.out.println("1 - Temperatura semestral");
            System.out.println("2 - Interrogatório");
            System.out.println("0 - Sair");
            System.out.println("############################\n\n");

            int escolhaExercicio = scanner.nextInt();

            switch (escolhaExercicio) {
                case 1:
                    exercicioTemperatura(scanner);
                    break;
                case 2:
                    exercicioInterrogatorio(scanner);
                    break;
                case 0:
                    sair = true;
                    break;
            
                default:
                    System.out.println("Escolha o número de um exercício existente");
                    break;
            }
        }   
        
        scanner.close();
    }

    private static void exercicioInterrogatorio(Scanner scanner) {
        Interrogatorio  interrogatorio = new Interrogatorio();

        System.out.println("Ocorreu um crime! Responda as perguntas com S para Sim e N para Não");
        

        for (String pergunta : interrogatorio.getPerguntas()) {
            Boolean respostaValida = false;
            while(!respostaValida){
                System.out.println(pergunta);
                String resposta = scanner.next();
                if (resposta.equalsIgnoreCase("s")) {
                    interrogatorio.setRespostas(true);
                    respostaValida = true;
                } else if(resposta.equalsIgnoreCase("n")){
                    interrogatorio.setRespostas(false);
                    respostaValida = true;
                } else {
                    System.out.println("Responda corretamente! S para Sim e N para Não");
                }
            }
        }

        System.out.println(">>>>>>>>>>> Você foi considerado " + interrogatorio.julgar() + "! <<<<<<<<<<<");
    }

    private static void exercicioTemperatura(Scanner scanner) {
        
        ArrayList<Temperatura> listaDeTemperatura = new ArrayList<>();
    
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
