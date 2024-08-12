/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exemplo4.basicojava_relacionais;

/**
 *
 * @author aluno.den
 */
public class Exemplo4BasicoJAVA_Relacionais {

    public static void main(String[] args) {        
        System.out.println("\tBásico em JAVA - Exemplo 4: Relacionais\n");
        
        //declare variaveis
        int primeiroNumero = 10;
        int segundoNumero = 2;
        int maiorNumero;
        
        //operadores artimeticos/relacionais
        if (primeiroNumero > segundoNumero) {
            maiorNumero = primeiroNumero;
        } else {
            maiorNumero = segundoNumero;
        }
        
        //exibir os resultados
        System.out.println("Maior número: " + maiorNumero);
    }
}
