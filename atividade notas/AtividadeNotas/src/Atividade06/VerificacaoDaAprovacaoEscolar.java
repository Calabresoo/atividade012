package Atividade06;

import java.util.Scanner;

public class VerificacaoDaAprovacaoEscolar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double nota = 0;


        System.out.println("Iforme a nota");
        nota = sc.nextDouble();

        if (nota >= 0 && nota <= 10) {


            //PARECIDO TEM QUE VER
            //PARECIDO TEM QUE VER
            //PARECIDO TEM QUE VER
            //PARECIDO TEM QUE VER
            //PARECIDO TEM QUE VER
            //PARECIDO TEM QUE VER
            //PARECIDO TEM QUE VER
            //PARECIDO TEM QUE VER


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
