package Aula_03;

import java.util.Scanner;

public class Celsius_Fahrenheit {
    public static void main(String args[])
    {
        Scanner ler = new Scanner(System.in);
        double celsius= 0, fahrenheit= 0;

        System.out.println("Entre com a temperatura em Fahrenheit");
        fahrenheit = ler.nextDouble();

        celsius = (fahrenheit - 32 ) * 5 / 9;

        System.out.println("Temperatura em Celsius " + celsius );
    }
}
