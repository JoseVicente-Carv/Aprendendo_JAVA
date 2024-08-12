/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exercicio2.basicojava;

import java.util.Scanner; //Biblioteca que permite o codigo ler algo digitado no terminal oom o teclado

/**
 *
 * @author aluno.den
 */
public class Exercicio2BasicoJAVA {

    public static void main(String[] args) {
        /*Exercício 2:
        Escrever um programa que ao entrar com dois números, imprimir o menor número 
        (suponha números diferentes).
        No final informar o menor número.*/
        
        System.out.println("\tExercício 2 - Básico em JAVA!");
        
        Scanner teclado = new Scanner(System.in); //permite que o código leia algo digitado no terminal com o teclado
        
        //inicie as variaveis
//        int primeiroNumero;
//        int segundoNumero;
        
        //colete dois números diferentes do usuario
        System.out.println("Digite o primeiro número: ");
        int primeiroNumero = teclado.nextInt();
        
        System.out.println("Digite o 2º número: ");
        int segundoNumero = teclado.nextInt();
        
        //compare os números digitado e mostre o menor 
        if (primeiroNumero > segundoNumero) {
            System.out.println("Maior número digitado: " + primeiroNumero);
        } else {
            System.out.println("Maior número digitado: " + segundoNumero);
        }
    }
}