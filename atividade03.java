import javax.print.attribute.standard.Media;
import java.util.Scanner;

public class atividade03 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double nota1 = 0;
        double nota2 = 0;
        double nota3 = 0;

        double media = 0;

        System.out.println("Qual a primeira nota");
        nota1 = sc.nextDouble();

        System.out.println("Qual a segunda nota do aluno");
        nota2 = sc.nextDouble();


        System.out.println("Qual a terceira nota do aluno");
        nota3 = sc.nextDouble();

        media = (nota1 = nota2 = nota1) / 3;


        System.out.printf("Média " + media);

    }

}
