package com.lucas.javabasico.exercicios16e17;

import java.util.Scanner;

/**
 *Altere o programa anterior para no final mostrar a soma dos numeros
 *
 * **/

public class exercicio11 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Primeiro numero");
        int num1 = sc.nextInt();

        System.out.println("Segundo numero");
        int num2 = sc.nextInt();

        int soma = 0;

        for (int i = num1; i <=num2 ; i++) {
            System.out.println(i);
            soma += i;
        }

        System.out.println(soma);
    }
}
