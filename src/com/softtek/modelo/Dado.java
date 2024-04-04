package com.softtek.modelo;

public class Dado {


    public void dibujos(int numero){
        switch (numero){
            case 1:
                System.out.println("*");
                break;
            case 2:
                System.out.println("*  ");
                System.out.println("   ");
                System.out.println("  *");
                break;
            case 3:
                System.out.println("*  ");
                System.out.println(" * ");
                System.out.println("  *");
                break;
            case 4:
                System.out.println("* *");
                System.out.println("   ");
                System.out.println("* *");
                break;
            case 5:
                System.out.println("* *");
                System.out.println(" * ");
                System.out.println("* *");
                break;
            case 6:
                System.out.println("* *");
                System.out.println("* *");
                System.out.println("* *");
                break;

            default:
                System.out.println("Dado no valido");
        }
    }
    public void tirardados(){
        int num = (int) (Math.random() * 6)+1;
        dibujos(num);
    }

}
