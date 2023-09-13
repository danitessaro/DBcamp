package desafiosLogica;

import java.util.Scanner;

public class NotaFinalAluno {
    public static void main(String[] args) {
        System.out.println("Digite as notas do Aluno: ");

        int soma = 0;
        for (int i = 0; i < 3; i++) {
            System.out.println("Nota: ");
            Scanner recebeNota = new Scanner(System.in);
            soma += recebeNota.nextInt();
        }

        int media = soma / 3;

        if (media >= 7) {
            System.out.println("Aprovado ");
        }

        if (media >= 5 && media < 7) {
            System.out.println("Recuperação ");
        }

        if (media < 5) {
            System.out.println("Reprovado ");
        }


    }
}
