/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exemplo6.basicojava_metodosstring;

/**
 *
 * @author aluno.den
 */
public class Exemplo6BasicoJAVA_MetodosString {

    public static void main(String[] args) {
        //inicie as variáveis
        String nome = "Vicente";
        String sobrenome = "Carvalho";
                
        System.out.println("Primeiro nome: " + nome);
        System.out.println("Sobrenome: " + sobrenome);
        
        //concatenando/Ligando/unindo o nome + sobrenome
        String nomeCompleto = nome.concat(" ").concat(sobrenome);
        
        System.out.println("\nNome completo: " + nomeCompleto);
        
        //exibindo a quantidade de caracteres em cada nome
        System.out.println("\nTamanho do primeiro nome: " + nome.length());
        System.out.println("Tamanho do sobrenome: " + sobrenome.length());
        
        //exibindo nome completo usando método String - Maiúsculo
        System.out.println("\nConcatenação maiúscula: " + nomeCompleto.toUpperCase());
        
        //exibindo nome completo usando método String - Minúsculo
        System.out.println("Concatenação Minúscula: " + nomeCompleto.toLowerCase());
    }
}