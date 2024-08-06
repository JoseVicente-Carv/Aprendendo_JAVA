/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.metodosstring.exemplo;

/**
 *
 * @author aluno.den
 */
public class MetodosStringExemplo {

    public static void main(String[] args) {
        System.out.println( "\tMetodos String - Exemplo\n" );

        // inicie as variáveis
        String nome = "Martha";
        String sobrenome = "Silveira";

        System.out.println("Nome: " + nome);
        System.out.println("Sobrenome: " + sobrenome);

        //exiba as quantidades de caracteres de cada variável/nome
        System.out.println("Tamanhop do nome: " + nome.length() + " caracteres");
        System.out.println("Tamanho do sobrenome: " + sobrenome.length() + " caracteres");
       
        //concatenando/juntando/conectando nome + sobrenome
        String nomeCompleto = nome.concat(" ").concat(sobrenome);

        System.out.println("Nome completo: " + nomeCompleto);

        // exibindo nome completo com método Strings - Maiúsculas & Minúsculas/em letras maiúsculas & minúsculas
        System.out.println("Concatenação maiscula: " + nomeCompleto.toUpperCase());
        System.out.println("Concatenação minuscula: "+nomeCompleto.toLowerCase());
    }
}