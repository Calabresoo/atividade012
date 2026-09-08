package atividade06;

import java.util.Scanner;

public class AtividadeAprovacaoEscolar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double media = 0;

        System.out.println("Informe a média final do aluno: ");
        media = sc.nextDouble();

        if (media >= 7) {
            System.out.println("Aluno Aprovado");
        } else if (media >= 5) {
            System.out.println("Aluno em Recuperação");
        } else {
            System.out.println("Aluno Reprovado");
        }

    }

}
