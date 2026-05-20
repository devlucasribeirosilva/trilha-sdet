package com.lucas.javabasico.exercicios16e17;

/**
 * Faça um programa que imprima na tela apenas os numeros impares entre 1 e 50
 * **/

public class exercicio09 {
    public static void main(String[] args) {

        for (int i = 1; i <=50 ; i++) {

            if (i % 2 != 0) {
                System.out.println("Numero impar: " + i);
            }
        }
    }
}
