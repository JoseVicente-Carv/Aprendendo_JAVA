/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.java.exemplo3;

import java.util.Scanner; //biblioteca importada automaticamente. Permite que a leitura de caracteres digitados.

/**
 *
 * @author aluno.den
 */
public class JAVAExemplo3 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in); //apertei Ctrl + espaço e automaticamente importou a biblioteca Scanner.
        
        System.out.println("Digite seu nome: "); 
        String nome = teclado.next();
        
        System.out.println("Digite sua idade: "); 
        int idade = teclado.nextInt();
        
        System.out.println("Digite seu peso: "); 
        double peso = teclado.nextDouble();
        
        System.out.println("Nome: "+ nome);
        System.out.println("Idade: "+ idade);
        System.out.println("Peso: "+ peso);
        
        teclado.close(); //encerra a conexão de JAVA com o teclado.
    }
}
