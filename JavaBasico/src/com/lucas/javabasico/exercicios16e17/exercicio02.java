package com.lucas.javabasico.exercicios16e17;

import java.util.Scanner;

/**
 * Faça um programa que leia o nome de um usuario e a senha, e não aceite a senha igual
 * o nome do usuario, mostrenado uma mensagem de erro e voltando a pedir as informações
 * **/

public class exercicio02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean informacoes = false;

        do {
            System.out.println("Digite o nome do usario: ");
            String nome = sc.next();
            System.out.println("Digite a senha: ");
            String senha = sc.next();

            if (nome.equals(senha)) {
                System.out.println("As senhas são iguais");
                //informacoes = false;
            } else {
                informacoes = true;
                System.out.println("Senha cadastrada");
            }
        } while (!informacoes);
    }
}
