package edu.dio.exercicio.bootcamp;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("descrição curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso js");
        curso2.setDescricao("descrição curso js");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de java");
        mentoria.setDescricao("descrição mentoria java");
        mentoria.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);
        
        Dev devHugo = new Dev();
        devHugo.setNome("Hugo");
        devHugo.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Hugo:" + devHugo.getConteudoInscritos());
        devHugo.progredir();
        devHugo.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Hugo:" + devHugo.getConteudoInscritos());
        System.out.println("Conteúdos Concluídos Hugo:" + devHugo.getConteudoConcluidos());
        System.out.println("XP:" + devHugo.calcularTotalXp());
    }
}
