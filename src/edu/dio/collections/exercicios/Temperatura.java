package edu.dio.collections.exercicios;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Temperatura {
    private String mes;
    private double temperatura;

    Temperatura(String mes, double temperatura){
        this.mes = mes;
        this.temperatura = temperatura;
    }

    public double getTemperatura(){
        return this.temperatura;
    }
    public String getMes(){
        return this.mes;
    }
    
}

class ComparatorTemperatura implements Comparator<Temperatura>{
    @Override
    public int compare(Temperatura temp1, Temperatura temp2) {
        return Double.compare(temp1.getTemperatura(), temp2.getTemperatura());
    }
}