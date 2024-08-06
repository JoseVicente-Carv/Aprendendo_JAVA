/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.java.exemplo1;

/**
 *
 * @author aluno.den
 */
public class JAVAExemplo1 {

    public static void main(String[] args) {
        System.out.println("1º Exemplo");
        
        //declaração de variaveis
        String nome = "Martha";
        int idade = 30;
        double peso = 65.2;
        
        //declaração de constantes
        final String CPF = "123.456.789-00";
        
        //exibindo resultados
        //concatenando (ligando, relacionando) com o sinal de "+"
        System.out.println("O nome do usuário é: " + nome);
        System.out.println("O CPF do usuário é: " + CPF);
        System.out.println("A idade do usuário é: " + idade + " anos");
        System.out.println("O peso do usário é: " + peso + " quilos");
    }
}
