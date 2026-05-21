package com.lucas.javabasico.aula18;

import java.util.Scanner;

/**
 * Complementa o break
 * Continue o loop na proxima iteração
 * **/

public class Continue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Entre com um número:");
        int num = sc.nextInt();

        System.out.println("Entre com um limite");
        int max = sc.nextInt();

        for (int i = 0; i <=max ; i++) {
            System.out.println(i);

            if ( i % 7 == 0) {

               continue;
            }
            System.out.println("O valor de i é : " + i);
        }
    }
}
