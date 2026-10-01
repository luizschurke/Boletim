import java.util.Scanner;

public class Main {
    public static vid main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=====================================");
        System.out.println("   SISTEMA DE NOTAS DA TURMA");
        System.out.println("=====================================");
        System.out.println();
        System.out.println("Informe as 3 notas do aluno.");
        System.out.println("Use ponto para separar decimais (exemplo: 7.5).");
        System.out.println();

        System.out.print("Digite a nota 1: ");
        double nota1 = sc.nextDouble();

        System.out.print("Digite a nota 2: ");
        double nota2 = sc.nextDouble();

        System.out.print("Digite a nota 3: ");
        double nota3 = sc.nextDouble();

        System.out.println();
        System.out.println("Notas digitadas:");
        System.out.println("Nota 1: " + nota1);
        System.out.println("Nota 2: " + nota2);
        System.out.println("Nota 3: " + nota3);

        sc.close();
    }
}