package com.lucas.javabasico.exercicios16e17;

import java.util.Scanner;

/**
 * Faça um programa que peça um numero inteiro e determine se ele é ou não um numero primo.
 * Um numero primeiro é aquele que só é divisivel por ele mesmo e por 1
 * **/

public class exercicio18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Entre com um número: ");
        int numero = sc.nextInt();

        boolean primo = true;
        for (int i = 2; i < numero; i++) {
            if (numero % i == 0) {
                System.out.println("Não é primo");
                primo = false;
            }
        }

        if (primo) {
            System.out.println("O número é primo");
        }
    }
}
