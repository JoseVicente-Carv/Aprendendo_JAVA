/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exercicio4.basicojava;

import java.util.Scanner;

/**
 *
 * @author aluno.den
 */
public class Exercicio4BasicoJAVA {

    public static void main(String[] args) {
        /*Faça um método que calcule a média de um aluno de acordo com o critério definido neste curso (Nota final = Média aritmética das notas de todas as atividades/avaliações).*/
        
        System.out.println("\tExercício 4 - Básico em JAVA\n");
        Scanner teclado = new Scanner (System.in);
        
//      Inciar variavel necessaria
        Double media;
        
        //coletar as notas individuais do aluino
        System.out.println("Digite a 1ª nota do aluno: ");
        double primeiraNota = teclado.nextDouble();
        
        System.out.println("Digite a segunda nota do aluno: ");
        double segundaNota = teclado.nextDouble();
        
        //fazer calculo da média
        media = (primeiraNota + segundaNota) / 2;
        
        //exibir resultados
        System.out.println("Média final do aluno: " + media);
    }
}