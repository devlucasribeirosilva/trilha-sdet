package com.lucas.javabasico.aula16;

/**
 * Esse comando avalia uma expressão e caso verdadeira executa o bloco dentro  do comando while
 */

public class LoopWhile {
    public static void main(String[] args) {
        int i = 1; //Para contador utilizando sempre i, count ou cont em portugues
        int max = 10;

        System.out.println("Contado até:" + max);

        while (i < max) {
            System.out.println("Valor de i: " + i);
            i++;
        }
    }
}
