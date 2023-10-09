package desafiosLogica;

import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double numero1, numero2, resultado;
        String operacao;

        System.out.print("Calculadora - Digite a operação desejada:");
        System.out.print("1 - Adição (+)");
        System.out.print("2 - Subtração (-)");
        System.out.print("3 - Multiplicação (*)");
        System.out.print("4 - Divisão (/)");

        operacao = scanner.next();

        System.out.print("Digite o primeiro número: ");
        numero1 = scanner.nextDouble();

        System.out.print("Digite o segundo número: ");
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

