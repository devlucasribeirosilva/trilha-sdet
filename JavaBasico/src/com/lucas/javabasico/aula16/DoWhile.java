package com.lucas.javabasico.aula16;
/**
 * Esse comando executa o bloco dentro do comando do e depois avalia a expressão. O bloco deixa de ser executado
 * após a expressão ficar falsa.
 */
public class DoWhile {
    public static void main(String[] args) {
        int i = 1;
        do {
            i++;
            System.out.println("Valor de i: " + i);
        } while (i <15);
        System.out.println(i);
    }
}
