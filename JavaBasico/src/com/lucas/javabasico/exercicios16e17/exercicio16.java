package com.lucas.javabasico.exercicios16e17;

import java.util.Scanner;

/**
 * Faça um programa igual a seria de Fibonacci até que o valor seja maior que 500.
 *
 **/
public class exercicio16 {
    public static void main(String[] args) {

        int primeiro = 1;
        int segundo = 1;
        int proximo = 1;

        System.out.println(primeiro);
        System.out.println(segundo);

        while (proximo <= 500) {
            proximo = primeiro + segundo;
            primeiro = segundo;
            segundo = proximo;
            System.out.println(proximo);
        }

    }

}

