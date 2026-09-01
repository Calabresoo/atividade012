package atividade05;

import java.util.Scanner;

public class VerificacaoDosDiasDaSemana {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int dia;
        int numero;


        System.out.print("Informe o dia da semana: ");
     dia = input.nextInt();

      switch (dia) {
        case 1 -> System.out.println("Segunda");
        case 2 ->  System.out.println("Terça");
        case 3 ->  System.out.println("Quarta");
        case 4 ->  System.out.println("Quinta");
        case 5 ->  System.out.println("Sexta");
        case 6 ->  System.out.println("Sábado");
        case 7 ->  System.out.println("Domingo");
      }




    }

}
