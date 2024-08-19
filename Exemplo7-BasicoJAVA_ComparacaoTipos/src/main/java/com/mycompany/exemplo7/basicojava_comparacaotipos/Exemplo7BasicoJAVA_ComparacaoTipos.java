/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exemplo7.basicojava_comparacaotipos;

/**
 *
 * @author aluno.den
 */
public class Exemplo7BasicoJAVA_ComparacaoTipos {

    public static void main(String[] args) { //Comparação: String vs Primitivos
        //declaração de variaveis
        String nomeUsuario = "Stareo";
        int senha = 456;
        
        boolean resultadoNome = nomeUsuario.equals("Stareo");
        boolean resultadoSenha = (senha == 321);
        
        //exibindo resultados
        System.out.println("O nome do usuario está correto? " + resultadoNome);
        System.out.println("A senha está correta? " + resultadoSenha);
    }
}