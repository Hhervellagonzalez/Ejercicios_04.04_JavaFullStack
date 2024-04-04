package com.softtek.presentacion;

import com.softtek.modelo.Dado;

import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Dado dado = new Dado();
        dado.tirardados();
        char letra;
        boolean continuar = true;

        while (continuar) {
            System.out.println("Quiere continuar S/N");
            letra = sc.next().charAt(0);
            if (letra == 's') {
                dado.tirardados();
            } else if (letra == 'n') {
                System.out.println("Fin de las tiradas");
                continuar = false;
            }
        }
        sc.close();
    }
}
