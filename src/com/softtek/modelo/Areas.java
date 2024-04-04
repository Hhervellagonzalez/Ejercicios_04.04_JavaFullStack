package com.softtek.modelo;

public class Areas {
    public static double areaCirculo(int radio){
        double pi = 3.14;
        double area;
        area = pi * Math.pow(radio, 2);
        return area;
    }

    public static int areaRectangulo(int base, int altura){
        int area;
        area = base * altura;
        return area;
    }
}
