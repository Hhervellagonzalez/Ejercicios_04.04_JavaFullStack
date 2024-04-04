package com.softtek.modelo;

public class Alumno {
    private String nombre;
    private int[] numParciales;

    public Alumno(String nombreAlumno, int numeroDeParciales){
        this.numParciales = new int[numeroDeParciales];
        this.nombre = nombreAlumno;
    }
    public void notas (int[] notas){
        for (int i = 0; i < numParciales.length; i++){
            numParciales[i] = notas[i];
        }
    }
    public int media(){
        int media = 0;
        for( int notas : numParciales){
            media += notas;
        }
        return media / numParciales.length;
    }
    public void vernotas(){
        for (int i = 0; i < numParciales.length; i ++){
            System.out.println("Nota parcial " + (i+1) + ": " + numParciales[i]);
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int[] getNumParciales() {
        return numParciales;
    }

    public void setNumParciales(int[] numParciales) {
        this.numParciales = numParciales;
    }
}
