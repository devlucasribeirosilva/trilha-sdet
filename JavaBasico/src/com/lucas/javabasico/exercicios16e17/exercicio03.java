package com.lucas.javabasico.exercicios16e17;

import java.util.Scanner;

/**
 * Faça um programa que leia e valide as seguintes informações:
 * A) Nome: maior que 3 caracteres
 * B) Idade: entre 0 e 150
 * C) Salario: maior que zero
 * D) Sexo: 'f' ou 'm'
 * E) Estado Cívil: 's', 'c', 'v' ou 'd'
 * **/

public class exercicio03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean infoValida = false;
        String nome;
        int idade;
        double salario;
        String sexo;
        String estadoCivil;

        do {

            System.out.println("Digite o nome: ");
            nome = sc.next();

            if (nome.length() > 3) {
                infoValida = true;
                System.out.println("Nome valido");
            } else {
                System.out.println("Nome precisa de mais caracteres");
            }
        } while (!infoValida);

        infoValida = false;

        do {
            System.out.println("Digite a idade: ");
            idade = sc.nextInt();

            if(idade > 0 && idade < 150) {
                infoValida = true;
                System.out.println("Idade valida");
            } else {
                System.out.println("Digite uma idade valida");
            }
        } while(!infoValida);

        infoValida = false;

        do {
            System.out.println("Digite o salario: ");
            salario = sc.nextDouble();

            if (salario > 0) {
                infoValida = true;
                System.out.println("Salario valido");
            } else {
                System.out.println("Digite um salario valido");
            }
        } while (!infoValida);

        infoValida = false;

        do {
            System.out.println("Digite o sexo: ");
            sexo = sc.next();

            if (sexo.equals("M") || sexo.equals("F")) {
                infoValida = true;
                System.out.println("Sexo valido");
            } else {
                System.out.println("Sexo invalido, digite novamente.");
            }
        } while (!infoValida);

        infoValida = false;

        do {
            System.out.println("Digite o estado civil: ");
            estadoCivil = sc.next();

            if (estadoCivil.equals("S") || estadoCivil.equals("C") || estadoCivil.equals("V") || estadoCivil.equals("D")) {
                infoValida = true;
                System.out.println("Estado civil valido");
            } else {
                System.out.println("Estado civil invalido");
            }
        } while (!infoValida);
    }
}
