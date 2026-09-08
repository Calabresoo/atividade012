package atividade10;

import java.util.Scanner;

public class AtividadeDescontoProgressivo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double valorTotal = 0;
        double percentualDesconto = 0;
        double valorDescontado = 0;
        double valorFinal = 0;

        System.out.println("Informe o valor total da compra: ");
        valorTotal = sc.nextDouble();

        if (valorTotal > 500) {
            percentualDesconto = 0.20;
        } else if (valorTotal >= 200) {
            percentualDesconto = 0.10;
        } else if (valorTotal >= 100) {
            percentualDesconto = 0.05;
        } else {
            percentualDesconto = 0;
        }

        valorDescontado = valorTotal * percentualDesconto;
        valorFinal = valorTotal - valorDescontado;

        System.out.println("Valor original: " + valorTotal);
        System.out.println("Percentual de desconto: " + (percentualDesconto * 100) + "%");
        System.out.println("Valor descontado: " + valorDescontado);
        System.out.println("Valor final da compra: " + valorFinal);

    }

}
