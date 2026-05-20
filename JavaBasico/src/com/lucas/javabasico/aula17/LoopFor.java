package com.lucas.javabasico.aula17;

/**
 * Executa um bloco de código que está dentro do comando for enquanto uma expressão for verdadeira
 * Muito utilizado na programação.
 *
 * a sintaxe do comando for é bem simples, sendo a seguinte:
 *
 * for (inicialização ; condição ; atualização) {
 *     bloco de código
 * };
 *
 * Existem duas formas de se escrever um for, seria o jeito "normal" e o jeito "composto"
 *
 * for (int i = 0, j = 10; i < j; i++, j--) {
 *     System.out.println(" i tem o valor de: " + i + " e j tem o valor de: " + j)
 * }
 * **/

public class LoopFor {
    public static void main(String[] args) {

        for (int i = 0; i < 5; i++) {
            System.out.println("I tem o valor de: " + i);
        }

        for (int i = 5; i > 0; i--) {
            System.out.println("I tem o valor de: " + i);
        }

        for (int i = 0, j = 10; i < j; i++, j--) {
            System.out.println(" i tem o valor de: " + i + " e j tem o valor de: " + j);

        }
        for (;; );
    }
}
