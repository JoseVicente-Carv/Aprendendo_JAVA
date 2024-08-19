/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exemplo5.basicojava_operadoreslogicos;

/**
 *
 * @author aluno.den
 */
public class Exemplo5BasicoJAVA_OperadoresLogicos {

    public static void main(String[] args) {
//        declaração de variaveis;
        boolean temSol = true;
        boolean folga = false;
        
        //só iriei passear se ambas condições foirem verdadeiras
        if (temSol && folga) {
            System.out.println("Eu vou sai hoje! :D");
        } else {
            System.out.println("Eu não vou sair hoje. ;_;");
        }
    }
}