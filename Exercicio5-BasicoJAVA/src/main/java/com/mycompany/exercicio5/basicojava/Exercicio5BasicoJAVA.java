/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exercicio5.basicojava;

import java.util.Scanner;

/**
 *
 * @author aluno.den
 */
public class Exercicio5BasicoJAVA {

    public static void main(String[] args) {
        /*Exercício 5:
        Faça um programa que receba do usuário o nome de login e a senha.
        
        Caso o nome de login e senha estejam corretos, mostre uma mensagem de: "Bem-vindo, usuário logado!".
        Caso contrário, mostre uma mensagem de: "Nome de usuário ou senha inválidos".*/
        Scanner teclado = new Scanner(System.in);
        
        //iniciar variaveis e definir o login e senha
        String login = "jvic18";
        String senha = "abretesesamo";
        
        //coletar a entrada de login e senha do usuario
        System.out.println("Login: ");
        String loginDigitado = teclado.next();
        
        System.out.println("Senha: ");
        String senhaDigitado = teclado.next();
        
        //verificar login e senha
        Boolean resultadoLogin = login.equals(loginDigitado);
        Boolean resultadoSenha = senha.equals(senhaDigitado);
        
        //mostrar mensagem de confirmação ou rejeição
        if (resultadoLogin && resultadoSenha) {
            System.out.println("Bem vindo, usuário logado!");
        } else {
            System.out.println("Nome de usuário ou senha inválidos.");
        }
    }
}