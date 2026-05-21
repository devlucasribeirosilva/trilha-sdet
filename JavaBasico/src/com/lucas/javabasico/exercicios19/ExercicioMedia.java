package com.lucas.javabasico.exercicios19;

/**
 * Crie um programa que:
 *
 * Declare um array de inteiros chamado temperaturas com as temperaturas de uma semana
 * (7 valores à sua escolha, ex: {28, 30, 27, 32, 29, 31, 26}).
 * Calcule e mostre a temperatura média da semana.
 * Mostre qual foi a maior temperatura e a menor temperatura.
 * Conte e mostre quantos dias tiveram temperatura acima de 28 graus.
 * Mostre a temperatura de cada dia no formato:
 *
 *    Dia 1: 28°C
 *    Dia 2: 30°C
 *    ...
 *
 *
 * **/

public class ExercicioMedia {
    public static void main(String[] args) {

        int[] temperaturas = {28, 30, 27, 32, 29, 31, 26};
        double soma = 0;

        for (int temp : temperaturas) {
            soma += temp;
        }
        double media = soma/ temperaturas.length;
        System.out.println(media);
    }
}
