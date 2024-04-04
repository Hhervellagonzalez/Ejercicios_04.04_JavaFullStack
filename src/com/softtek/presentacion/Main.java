package com.softtek.presentacion;
        /*
        Crear la cadena de texto: “Nunca mates una mosca sobre la cabeza de un tigre.”
        • Mostrar la cadena toda en mayúsculas
        • Mostrar la cadena en minúsculas
        • Mostrar solo la palabra Nunca
        • Mostrar solo la palabra mosca
        • Mostrar la palabra cabeza
        • Mostrar la posición de la letra primera m
        • Devolver la longitud de la cadena
         */

public class Main {
    public static void main(String[] args) {
        String cadena = "Nunca mates una mosca sobre la cabeza de un tigre.";

        System.out.println(cadena.toUpperCase());
        System.out.println(cadena.toLowerCase());
        System.out.println(cadena.split(" ")[0]);
        System.out.println(cadena.split(" ")[4]);
        System.out.println(cadena.split(" ")[6]);
        System.out.println(cadena.indexOf('m'));
        System.out.println(cadena.length());
    }
}
