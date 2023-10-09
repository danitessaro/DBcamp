package desafiosLogica;

import java.util.Scanner;

public class DivisaoDeValores {

    public static void main(String[] args) {

        double numero1, numero2, resultadoDivisao = 0;
        Scanner scanner = new Scanner(System.in);
        boolean valorInvalido;

        do {
            System.out.print("Digite o primeiro número: ");
            numero1 = scanner.nextDouble();
            System.out.print("Digite o segundo número: ");
            numero2 = scanner.nextDouble();
            valorInvalido = numero1 == 0 || numero2 == 0;

            if (valorInvalido) {
                System.out.println("Digite um valor diferente de zero.");
            }
        }
        while (valorInvalido);

        resultadoDivisao = numero1 / numero2;
        System.out.println(numero1 + " / " + numero2 + " = " + resultadoDivisao);

    }
}

