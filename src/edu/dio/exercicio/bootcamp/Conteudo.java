package edu.dio.exercicio.bootcamp;

public abstract class Conteudo {
    protected final double XP_PADRAO = 10d;


    private String titulo;
    private String descricao;

    
    public String getDescricao() {
        return descricao;
    }
    public String getTitulo() {
        return titulo;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public abstract double calcularXp();
}
