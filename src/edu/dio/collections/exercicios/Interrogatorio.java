package edu.dio.collections.exercicios;

import java.util.ArrayList;

public class Interrogatorio {
    private ArrayList<String> perguntas = new ArrayList<>(){{
        add("Telefonou para a vítima?");
        add("Esteve no local do crime?");
        add("Mora perto da vítima?");
        add("Devia para a vítima?");
        add("Já trabalhou com a vítima?");
    }};
    private ArrayList<Boolean> respostas = new ArrayList<>();
    
    public ArrayList<String> getPerguntas() {
        return perguntas;
    }
    public ArrayList<Boolean> getRespostas() {
        return respostas;
    }

    public void setRespostas(Boolean resposta) {
        this.respostas.add(resposta);
    }

    public String julgar() {
        int respostasPositivas =0;
        for (Boolean resposta : this.respostas) {
            if (resposta) respostasPositivas++;
        }
        if(respostasPositivas == 5) return "Assassino";
        if(respostasPositivas == 3 || respostasPositivas == 4) return "Cúmplice";
        if(respostasPositivas == 2) return "Suspeito";
        if(respostasPositivas <= 1) return "Inocente";

        return "Erro: respostas positivas - "+ respostasPositivas;
    }
}
