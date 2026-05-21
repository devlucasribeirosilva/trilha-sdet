package com.lucas.javabasico.aula19;

/**
 * Estrutura de dados mais simples existente na maioria das linguagens de programação
 * Lista ordenada de Dados
 * **/

public class Arrays {
    public static void main(String[] args) {

        double [] temperaturas = new double[365];
        temperaturas[0] = 31.3;
        temperaturas[1] = 32;
        temperaturas[2] = 35;
        temperaturas[3] = 20;
        temperaturas[4] = 19;

        System.out.println("o valor da temperatura do dia 3 é: " + temperaturas[2]);

        System.out.println("O Tamanho do array é: " + temperaturas.length);

        for (int i = 0; i < temperaturas.length ; i++) {
            System.out.println("o valor da temperatura do dia: " + (i+1) + " é " + temperaturas[i]);
        }
    }
}
