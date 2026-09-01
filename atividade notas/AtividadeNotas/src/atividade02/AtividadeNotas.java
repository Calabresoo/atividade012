package atividade02;

import java.util.Scanner;

public class AtividadeNotas {
    public static void main(String[] args) {


        double nota = 0;
        Scanner sc = new Scanner(System.in);


        System.out.println("Iforme a nota");
        nota = sc.nextDouble();

        if (nota >= 0 && nota <= 10) {

            //aqui vai a logica das notas

            if (nota >= 9) {
                System.out.println("Nota Excelente");
            } else if (nota >= 7) {
                System.out.println("Nota Boa");
            } else if (nota >= 5) {
                System.out.println("Satisfatória");
            } else {
                System.out.println("Nota Ruim");
            }

        } else {
            System.err.println("nota invalida");


        }


    }


}
