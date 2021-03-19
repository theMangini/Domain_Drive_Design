package Aula_03;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Hipotenusa {
    public static void main(String args[])
    {
        Scanner ler = new Scanner(System.in);
        DecimalFormat f = new DecimalFormat("#.##");
        double a,b,c;

        System.out.println("Entre com o valor do cateto adjacente");
        a=ler.nextDouble();

        System.out.println("Entre com o valor do cateto oposto");
        b=ler.nextDouble();

        c= Math.pow(a,2) + Math.pow(b,2);
        c= Math.sqrt(c);

        System.out.println("Valor da hipotenuse " + f.format(c) );
    }
}