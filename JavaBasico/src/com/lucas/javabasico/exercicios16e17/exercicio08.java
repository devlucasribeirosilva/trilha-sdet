package com.lucas.javabasico.exercicios16e17;

import java.util.Scanner;

/**
 * Faça um programa que leia 5 numeros e informe a soma e a media dos numeros
 * **/

public class exercicio08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numero;
        double soma = 0;
        double media;

        for (int i = 0; i <5 ; i++) {
            System.out.println("Digite um numero");
            numero = sc.nextInt();

            soma += numero;
        }
        media = soma/5;

        System.out.println(soma);
        System.out.println(media);

    }
}
