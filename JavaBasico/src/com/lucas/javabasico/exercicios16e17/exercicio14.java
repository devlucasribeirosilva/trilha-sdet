package com.lucas.javabasico.exercicios16e17;

import java.util.Scanner;

/**
 * Faça um programa que peça 10 numeros inteiros, calcule e mostre a quantidade de numeros
 * pares e a quantidade de numeros inteiros
 *
 * **/

public class exercicio14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num;
        int pares = 0;
        int impares = 0;
        for (int i = 0; i <10 ; i++) {
            System.out.println("digite o numero");
            num = sc.nextInt();

            if (num % 2 == 0 ) {
                pares++;
            } else {
                impares++;
            }
        }
        System.out.println(pares);
        System.out.println(impares);
    }
}
