package com.lucas.javabasico.exercicios16e17;

import java.util.Scanner;

/**
 * Faça um programa que calcule o fatorial de um numero inteiro fornecido pelo usuario
 * Ex: 5! = 5*4*3*2*1 = 120
 * **/

public class exercicio17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um numero: ");
        int numero = sc.nextInt();

        System.out.println(numero + "! = ");

        int fatorial = 1;
        for (int i = numero; i >0 ; i--) {
            fatorial *= i;
            System.out.println(i + " * ");
        }
        System.out.println("Resultado: " + fatorial);
    }
}
