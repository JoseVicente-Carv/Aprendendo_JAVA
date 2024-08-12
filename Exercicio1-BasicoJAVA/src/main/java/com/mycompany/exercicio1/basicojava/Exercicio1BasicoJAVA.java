/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exercicio1.basicojava;

import java.sql.SQLOutput;
import java.util.Scanner; //Biblioteca que permite o codigo ler algo digitado no terminal oom o teclado

/**
 *
 * @author aluno.den
 */
public class Exercicio1BasicoJAVA {

    public static void main(String[] args) {
        /*Exercício 1:
        A Loja Mamão com Açúcar está vendendo seus produtos em 5 (cinco) prestações sem juros. Faça um programa que receba um valor de uma compra e mostre o valor das prestações.
        No final informar o nome do mercado e valor de cada parcela.*/
        
        Scanner teclado = new Scanner(System.in);
                
        System.out.println("\tExercício 1 - Básico em JAVA\n"); //cabecalho
        
//        inicie as variaveis
        String nomeLoja = "Loja Mamão com Açucar";
//        double precoProduto;
        double parcela;
      
//        Colete o preço inteiro de um produto
        System.out.println("Digite o preço do produto: ");
        double precoProduto = teclado.nextDouble();
        
//        mostrar o valor do preço inteiro divido por 5
        parcela = precoProduto / 5;
        
        System.out.println("Estabelecimento: " + nomeLoja);
        System.out.println("Valor de cada prestação/parcela: " + parcela);
    }
}