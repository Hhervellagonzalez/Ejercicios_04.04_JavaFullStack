package com.softtek.presentacion;

import com.softtek.modelo.Alumno;

public class Ejercicio6 {
    public static void main(String[] args) {

        Alumno alumno = new Alumno("Pedro", 5);
        int[] notas = {5,2,3,8,5};
        alumno.notas(notas);

        alumno.vernotas();
        System.out.println("Media de las notas: " + alumno.media());
    }
}

