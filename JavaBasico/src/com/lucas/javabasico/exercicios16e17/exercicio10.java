package com.lucas.javabasico.exercicios16e17;

import java.util.Scanner;

/**
 * Faça um programa que receba dois numeros inteiros e gere os números inteiros
 * que estão nos intervalos compreendido por eles
 *
 * **/

public class exercicio10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Primeiro numero");
        int num1 = sc.nextInt();

        System.out.println("Segundo numero");
        int num2 = sc.nextInt();

        for (int i = num1; i <=num2 ; i++) {
            System.out.println(i);
        }
    }
}
