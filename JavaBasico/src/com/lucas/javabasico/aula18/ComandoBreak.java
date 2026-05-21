package com.lucas.javabasico.aula18;

/**
 * Usado para saída de loops
 * Pode ser usado justamente com um rotulo (label)
 *
 * **/

public class ComandoBreak {
    public static void main(String[] args) {
        int num = 100;

        for (int i = 0; i < num ; i++) {
            if (i * i >= num) {
                break;
            }
            System.out.println("Valor de i : " + i);
        }
    }
}
