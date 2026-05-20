package com.lucas.javabasico.exercicios16e17;

import java.util.Scanner;

/**
 * Supondo que a população de um pais A seja de ordem de 80000 habitantes com uma taxa anual de
 * crescimento de 3% e que a população B seja de 200000 habitantes com uma taxa de crescimento
 * de 1.5%. Faça um programa que calcule e escreva o número de anos necessarios para que a
 * população do pais A ultrapasse ou iguale a  população do pais B, mantidas as taxas de crescimento
 * **/

public class exercicio04 {
    public static void main(String[] args) {

        int popA = 80000;
        int popB = 200000;
        int cont = 0;

        while (popA <= popB) {
            popA += (popA/100) * 3;
            popB += (popB/100) * 1.5;
            cont++;
        }

        System.out.println("População A: " + popA);
        System.out.println("População B: " + popB);
        System.out.println("Quantidade de anos: " + cont);

    }
}
