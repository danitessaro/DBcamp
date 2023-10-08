package desafiosLogica;

import java.util.Scanner;

public class EncerraPrograma {

    public static void main(String[] args) {
        int numeroDigitado;
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.print("Digite um numero inteiro: ");
            numeroDigitado = scanner.nextInt();
        }
        while (numeroDigitado !=10);
        System.out.println("Programa Encerrado");
    }
}
