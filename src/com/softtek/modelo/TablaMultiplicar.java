package com.softtek.modelo;

public class TablaMultiplicar {
    private int num;

    public TablaMultiplicar(int numero){
        this.num = numero;
    }

    public String tabla(){
        String resultado = "Tabla: \n";
        for (int i = 1; i <= 10;i++){
            resultado += this.num + " x "+ i + " = " + String.valueOf(this.num * i + "\n");
        }
        return resultado;
    }
}
