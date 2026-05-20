package com.lucas.javabasico.exercicios16e17;

import java.util.Scanner;

/**
 * Desenvolva um gerador de tabuada capaz de gerar a tabuada de qualquer numero inteiro
 * entre 1 e 10. O usuario deve informar de qual numero ele deseja ver a tabuada. A saida deve
 * conforma o exemplo abaixo:
 *
 * Tabuada de 5:
 * 5x1 = 5
 * 5x2 = 10
 * ...
 * 5x10 = 50
 *
 * **/

public class exercicio12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o numero para a tabuada: ");
        int numero = sc.nextInt();

        System.out.println("Tabuada de : " + numero);

        for (int i = 1; i <=10 ; i++) {
            System.out.println(numero + " x " + i + " = " + (numero*i));
        }
    }
}
