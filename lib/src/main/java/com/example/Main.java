package com.example;

public class Main
{

    public static void main(String[] args){
        // Se crea un objeto del tipo Number
        // y se inicializa con los valores 3 y 6
        Number mNumber = new Number(3, 6);

        // Se incrementa el valor de la suma
        // utilizando la variable de clase de
        // Number
        mNumber.setIncrement(Number.INCREMENT);

        // Se obtiene el resultado de la suma
        // de los parámetros más el incremento
        // result = 10
        int result = mNumber.getParamSum();

        //Se imprime por consola el resultado de la suma con el incremento
        System.out.println("El resultado es... "+result);
    }
}
