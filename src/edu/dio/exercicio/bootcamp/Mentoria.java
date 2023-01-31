package edu.dio.exercicio.bootcamp;

import java.time.LocalDate;

public class Mentoria extends Conteudo{
    
    private LocalDate data;

    public LocalDate getData() {
        return data;
    }
    
    public void setData(LocalDate data) {
        this.data = data;
    }

    @Override
    public double calcularXp() {
        return XP_PADRAO + 10d;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "Mentoria{" +
            "titulo: " + getTitulo() + ", " +
            "descricao: " + getDescricao() + ", " +
            "data: " + data +
            "}";

    }
}
