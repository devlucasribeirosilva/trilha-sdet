package com.lucas.javabasico.exercicios16e17;

import java.util.Scanner;

/***
 * Faça um programa que peça dois numeros, base e expoente, calcule e mostre o primeiro
 * elevado ao segundo numero. Não utilize a função de potencia da linguagem
 *
 * */

public class exercicio13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o primeiro numero: ");
        int base = sc.nextInt();

        System.out.println("Digite o segundo numero: ");
        int potencia = sc.nextInt();
        
        int resultado = base;

        for (int i = 1; i <potencia; i++) {
            resultado *= base;
        }

        System.out.println(resultado);

    }
}
