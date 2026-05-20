package com.lucas.javabasico.exercicios16e17;

import java.util.Scanner;

/**
 * faça um programa que leia 5 numeros e diga qual é o maior
 * **/

public class exercicio07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numero;
        int maior = Integer.MIN_VALUE;

        for (int i = 0; i <5 ; i++) {
            System.out.println("Entre com um número: ");
            numero = sc.nextInt();

            if (numero > maior) {
                maior = numero;
            }
        }
        System.out.println(maior);
    }
}
