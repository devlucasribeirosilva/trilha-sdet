package com.lucas.javabasico.exercicios16e17;

import java.util.Scanner;

/**
 * A seria de Fibonacci e formada pela sequencia 1,1,2,3,5,8,13,21,34,55..., faça um programa
 * capaz de gerar até o n-ésimo número.
 *
 */


public class exercicio15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Entre com o n-ésimo número de Fibonacci: ");
        int n = sc.nextInt();
        int primeiro = 1;
        int segundo = 1;
        int proximo;

        for (int i = 3; i <=n ; i++) {
            proximo = primeiro + segundo;
            primeiro = segundo;
            segundo = proximo;

            System.out.println(proximo);
        }

    }

}
