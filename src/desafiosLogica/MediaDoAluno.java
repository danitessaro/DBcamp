package desafiosLogica;

import java.util.Scanner;

public class MediaDoAluno {
    public static void main(String[] args) {

        double nota1, nota2, notaFinal = 0;
        String realizarNovoCalculo;
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.print("Digite a primeira nota: ");
            nota1 = scanner.nextDouble();
            System.out.print("Digite a segunda nota: ");
            nota2 = scanner.nextDouble();
            notaFinal = (nota1 + nota2) / 2;

            if (notaFinal >= 7) {
                System.out.println("Você foi aprovado com a media final: " + notaFinal);
            }
            else {
                System.out.println("Você foi reprovado pois a média final foi: " + notaFinal);
            }
            System.out.print("Você deseja realizar mais um calculo? ");
            realizarNovoCalculo = scanner.next();
        }
        while (!realizarNovoCalculo.equals("n"));
    }
}
