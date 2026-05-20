package com.lucas.javabasico.exercicios16e17;

import java.util.Scanner;

/***
 *Altere o programa anterior permitindo ao usuario informar as populações e as taxas
 * de crescimento inicial. Valida a entrada e permita repetir a operação
 * */

public class exercicio05 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        boolean valido = false;
        int popA;
        int popB;
        double taxaA;
        double taxaB;


        do {
            System.out.println("Entre com a população A: ");
            popA = sc.nextInt();

            if (popA > 0) {
                valido = true;
            } else {
                System.out.println("Precisa ser maior que zero");
            }

        } while (!valido);

        valido = false;

        do {
            System.out.println("Entre com a população B: ");
            popB = sc.nextInt();

            if (popB > 0) {
                valido = true;
            } else {
                System.out.println("Precisa ser maior que zero");
            }

        } while (!valido);

        valido = false;

        do {
            System.out.println("Entre com a taxa de Credimento: ");
            taxaA = sc.nextDouble();

            if (taxaA > 0) {
                valido = true;
            } else {
                System.out.println("Precisa ser maior que zero");
            }

        } while (!valido);

        valido = false;

        do {
            System.out.println("Entre com a Taxa de crescimento: ");
            taxaB = sc.nextDouble();

            if (taxaB> 0) {
                valido = true;
            } else {
                System.out.println("Precisa ser maior que zero");
            }

        } while (!valido);



        int cont = 0;
        while (popA <= popB) {
            popA += (popA/100) * taxaA;
            popB += (popB/100) * taxaB;
           cont++;
        }

        System.out.println("População A: " + popA);
        System.out.println("População B: " + popB);
        System.out.println("Quantidade de anos: " + cont);

    }
}