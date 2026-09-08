package atividade08;

import java.util.Scanner;

public class AtividadeClassificacaoTemperatura {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double temperatura = 0;

        System.out.println("Informe a temperatura em graus Celsius: ");
        temperatura = sc.nextDouble();

        if (temperatura > 30) {
            System.out.println("Quente");
        } else if (temperatura >= 15) {
            System.out.println("Agradável");
        } else {
            System.out.println("Frio");
        }

    }

}
