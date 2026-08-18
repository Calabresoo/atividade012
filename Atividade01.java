import java.util.Scanner;


public class Atividade01 {

    void main(String[] args) {


        //inicialização de variaveis

        String nome = "";
        String curso = "";
        int periodo = 0;
        int idade = 0;

        //Scanner é uma classe
        //sc é o nome do objeto
        //new estância (cria) um objeto
        //new Scanner indica o tipo do objeto criado
        //(System.in) é um parâmetro
        //lembrar do IMPORT
        Scanner sc = new Scanner(System.in);

        System.out.println("Qual é o seu nome?");
        nome = sc.nextLine();
        System.out.println("Qual é o seu curso?");
        curso = sc.nextLine();
        System.out.println("Qual é o periodo?");
        periodo = sc.nextInt();
        System.out.println("Qual é a sua idade");
        idade = sc.nextInt();


        System.out.println("O nome é " + nome);
        System.out.println("O curso é " + curso);
        System.out.println("O periodo é " + periodo);
        System.out.println(" Idade é " + idade + " anos");


    }
}