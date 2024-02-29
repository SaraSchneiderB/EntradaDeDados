package com.mycompany.entradadedados;

import java.util.Locale;
import java.util.Scanner;

public class EntradaDeDados {

    public static void main(String[] args) {

        /*
        next() ou nextline() é para String (digitar texto)
        nextInt() para escrever um número inteiro
        nextFloat() para digitar float (números com vírgula)
        nextDouble() para digitar números com vírgula
         */
        Locale.setDefault(Locale.US);

        Scanner teclado = new Scanner(System.in);  //scanner serve criar e inserir algum dado

        String x, y, z;  //Pode ser usado assim ou diretamente na associação, economisando linha
        int w;
        //int y;
        //double z;

        System.out.println("Pode digitar");
        //System.out.println("Digitel uma palavra, um número, um número com ponto e uma letra");

        /*String x = teclado.nextLine();
        int y = teclado.nextInt();
        double z = teclado.nextDouble();
        char w = teclado.next().charAt(3);*/
        w = teclado.nextInt();
        teclado.nextLine();
        x = teclado.nextLine();
        y = teclado.nextLine();
        z = teclado.nextLine();

        System.out.println("Dados digitados: ");
        System.out.println(w);
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
        //System.out.println(w);   char

        teclado.close();

    }
}
