package com.softtek.modelo;

public class Campos {
    private int campo;

    public Campos (int nuemro){
        this.campo = nuemro;
    }

    public void Muestra(){
        System.out.println("Valor: " + this.campo);
    }

    public void Incrementa(){
        System.out.println("Incrementamos el campo.");
        campo++;
    }
}
