package com.lucas.javabasico.aula20;

/**
 * Faça um programa que crie uma matriz 3x3x3 onde cada elemento de matriz seja igual
 * a soma dos seus índices (exemplo: [1,2,1] = 1+2+1 =4. Obtenha a soma de todos os elementos
 * da matriz, e obtenha a soma dos elementos cujos valores são pares e a soma dos elementos cujos
 * valores são ímpares. Exiba na tela os valores da soma total, soma dos pares e dos impares
 *
 **/

public class Matriz3Dimensoes {
    public static void main(String[] args) {

        int[][][] matriz = new int[3][3][3];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                for (int k = 0; k < matriz[i][j].length; k++) {
                    matriz[i][j][k] = i + j + k;
                }

            }

        }

        int soma = 0;
        int somaImpares = 0;
        int somaPares = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                for (int k = 0; k < matriz[i][j].length; k++) {
                    soma += matriz[i][j][k];

                    if (matriz[i][j][k] % 2 == 0) {
                        somaPares += matriz[i][j][k];
                    } else {
                        somaImpares += matriz[i][j][k];
                    }
                }

            }

        }
        System.out.println(soma);
        System.out.println(somaImpares);
        System.out.println(somaPares);
    }
}
