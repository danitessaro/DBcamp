package desafiosLogica;

import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double numero1, numero2, resultado;
        String operacao;

        System.out.println("Calculadora - Digite a operação desejada:");
        System.out.println("1 - Adição (+)");
        System.out.println("2 - Subtração (-)");
        System.out.println("3 - Multiplicação (*)");
        System.out.println("4 - Divisão (/)");

        operacao = scanner.next();

        System.out.println("Digite o primeiro número: ");
        numero1 = scanner.nextDouble();

        System.out.println("Digite o segundo número: ");
        numero2 = scanner.nextDouble();

        switch (operacao) {
            case "1":
                resultado = numero1 + numero2;
                System.out.println("Resultado: " + resultado);
                break;
            case "2":
                resultado = numero1 - numero2;
                System.out.println("Resultado: " + resultado);
                break;
            case "3":
                resultado = numero1 * numero2;
                System.out.println("Resultado: " + resultado);
                break;
            case "4":
                resultado = numero1 / numero2;
                System.out.println("Resultado: " + resultado);
                break;
            default:
                System.out.println("Operação inválida.");
        }

        scanner.close();
    }
}

