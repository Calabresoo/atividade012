package atividade07;

import java.util.Scanner;

public class AtividadeCalculadoraSimples {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double numero1 = 0;
        double numero2 = 0;
        String operacao;
        double resultado = 0;

        System.out.println("Informe o primeiro número: ");
        numero1 = sc.nextDouble();

        System.out.println("Informe o segundo número: ");
        numero2 = sc.nextDouble();

        System.out.println("Informe a operação (+, -, *, /): ");
        operacao = sc.next();

        if (operacao.equals("+")) {
            resultado = numero1 + numero2;
            System.out.println("Resultado: " + resultado);
        } else if (operacao.equals("-")) {
            resultado = numero1 - numero2;
            System.out.println("Resultado: " + resultado);
        } else if (operacao.equals("*")) {
            resultado = numero1 * numero2;
            System.out.println("Resultado: " + resultado);
        } else if (operacao.equals("/")) {
            if (numero2 != 0) {
                resultado = numero1 / numero2;
                System.out.println("Resultado: " + resultado);
            } else {
                System.err.println("Não é possível dividir por zero");
            }
        } else {
            System.err.println("Operação inválida");
        }

    }

}
