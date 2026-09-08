package atividade11;

import java.util.Scanner;

public class AtividadeSalarioBonificacaoImpostos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double salarioBruto = 0;
        int anosTrabalhados = 0;
        double percentualBonus = 0;
        double percentualImposto = 0;
        double bonus = 0;
        double imposto = 0;
        double salarioLiquido = 0;

        System.out.println("Informe o salário bruto do funcionário: ");
        salarioBruto = sc.nextDouble();

        System.out.println("Informe quantos anos o funcionário trabalhou na empresa: ");
        anosTrabalhados = sc.nextInt();

        //bonificação

        if (anosTrabalhados > 10) {
            percentualBonus = 0.10;
        } else if (anosTrabalhados >= 5) {
            percentualBonus = 0.05;
        } else {
            percentualBonus = 0;
        }

        //imposto

        if (salarioBruto > 5000) {
            percentualImposto = 0.27;
        } else if (salarioBruto >= 3000) {
            percentualImposto = 0.18;
        } else {
            percentualImposto = 0.10;
        }

        bonus = salarioBruto * percentualBonus;
        imposto = salarioBruto * percentualImposto;
        salarioLiquido = salarioBruto + bonus - imposto;

        System.out.println("Salário bruto: " + salarioBruto);
        System.out.println("Bônus recebido: " + bonus);
        System.out.println("Imposto descontado: " + imposto);
        System.out.println("Salário líquido: " + salarioLiquido);

    }

}
