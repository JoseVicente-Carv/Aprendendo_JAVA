/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exercicio3.basicojava;

import java.util.Scanner;

/**
 *
 * @author aluno.den
 */
public class Exercicio32BasicoJAVA {

    public static void main(String[] args) {
        /*Exercício 3:
        Escrever um programa que leia o nome de um aluno e as notas das duas provas que ele obteve no semestre.

        No final informar o nome e média aritmética das notas do aluno.

        Se a média aritmética do aluno for menor que 7, o aluno está reprovado.*/

        System.out.println("\tExercicio 3 - Básico em JAVA\n");

        Scanner teclado = new Scanner(System.in);

        //inicie as variaveis
        Double media;

        //peça os dados ao usuario
        System.out.println("Digite o nome do aluno: ");
        String nomeAluno = teclado.next();

        System.out.println("Digite a 1ª nota do aluno: ");
        double primeiraNota = teclado.nextDouble();

        System.out.println("Digite a segunda nota do aluno: ");
        double segundaNota = teclado.nextDouble();

        //calcule a média das notas
        media = (primeiraNota + segundaNota) / 2;
                
        //mostrar nome + media das notas do aluno
        System.out.println("Nome do aluno: " + nomeAluno);
        
        System.out.println("Média do aluno: " + media);
        
        if (media < 7) {
            System.out.println("Aluno Reprovado.");
        } else {
            System.out.println("Aluno Aprovado.");
        }
    }
}