package Aula_03;

import java.util.Scanner;

public class Fahrenheit_Celsius {
    public static void main(String args[])
    {
        Scanner ler = new Scanner(System.in);
        double celsius=0, fahrenheit=0;

        System.out.println("Entre com a temperatura em Celsius");
        celsius=ler.nextDouble();

        fahrenheit = celsius * 1.8 + 32;

        System.out.println("Temperatura em fahrenheit "+ fahrenheit );





    }
}
