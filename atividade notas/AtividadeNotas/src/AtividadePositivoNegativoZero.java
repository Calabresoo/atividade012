package atividade09;

import java.util.Scanner;

public class AtividadePositivoNegativoZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double numero = 0;

        System.out.println("Informe um número: ");
        numero = sc.nextDouble();

        if (numero > 0) {
            System.out.println("O número é positivo");
        } else if (numero < 0) {
            System.out.println("O número é negativo");
        } else {
            System.out.println("O número é zero");
        }

    }

}
