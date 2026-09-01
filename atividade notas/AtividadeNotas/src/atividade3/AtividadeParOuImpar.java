package atividade3;

import java.util.Scanner;

public class AtividadeParOuImpar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numero = 0;

        System.out.println("Informe Um Número Inteiro");
        numero = sc.nextInt();

        if (numero % 2 == 0) {
            System.out.println("O número é par.");
        } else {
            System.out.println("O número é impar.");
        }




    }

}
