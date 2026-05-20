package com.lucas.javabasico.exercicios16e17;

import java.util.Scanner;

/**
 * Faça um programa que peça uma nota entre zero e dez. Mostre uma mensagem caso o valor seja
 * invalido e continue pedindo até que o usuario informe um valor valido
 * **/

public class exercicio01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean notaValida = false;

        do {
            System.out.println("Entre com uma nota");
            double nota = sc.nextDouble();

            if (nota > 0 && nota < 10) {
                System.out.println("Nota valida");
                notaValida = true;
            } else {
                System.out.println("Nota invalida, digite novamente");
            }
        } while(!notaValida);

    }
}
