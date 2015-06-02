package com.example;

public class Number
{
    // Variable de clase
    public static final int INCREMENT = 1;

    // Variables de instancia
    private int mParam1;
    private int mParam2;
    private int sum;


    // Método constructor con dos parámetros
    // de entrada donde se inicializan las
    // variables de instancia
    public Number(int aParam1, int aParam2)
    {
        mParam1 = aParam1;
        mParam2 = aParam2;
        sum = aParam1 + aParam2;
    }

    // Método para obtener la suma
    // de los parámetros
    public int getParamSum()
    {
        return sum;
    }

    // Método para aumentar el valor de la
    // suma según la variable aIncrement.
    public void setIncrement(int aIncrement)
    {
        sum += aIncrement;
    }

}

