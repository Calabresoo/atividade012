package atividade04;

import java.util.Scanner;

public class VerificacaoDeLogin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //nome/senha corretos

        String usuarioCorreto = "admin";
        String senhaCorreto = "admin123";

        //usuario informa a senha

        String login;
        String senha;

        System.out.println("Digite seu login: ");
        login = sc.nextLine();


        System.out.println("Digite sua senha: ");
        senha = sc.nextLine();


        // comparação


        if (login.equals(usuarioCorreto) && senha.equals(senhaCorreto)) {
            System.out.println("Login e Senha correto");
        }else {

            System.out.println("Login ou senha incorreto");


        }


    }

}