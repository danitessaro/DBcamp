package desafiosLogica;

import java.util.Scanner;

public class MercadoCompra {

    public static void main(String[] args) {

        System.out.println("Bebidas Disponiveis no mercado: ");
        System.out.println("Cerveja [1], Refrigerante [2], Água [3]");

        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite a opção da bebida escolhida:");

        int opcaoBebida = teclado.nextInt();
        String bebidaEscolhida = getDescricaoBebida(opcaoBebida);
        boolean compraValida = true;

        if (bebidaEscolhida.equals("Cerveja")) {
            System.out.print("Qual sua idade? ");
            int idade = teclado.nextInt();
            if (idade < 18) {
                compraValida = false;
            }

        }
        if (compraValida) {
            System.out.println("Compra efetuada com sucesso");
            System.out.println("Você escolheu " + bebidaEscolhida);
        } else {
            System.out.println("Compra negada");
        }
    }



    private static String getDescricaoBebida(int opcaoBebida) {
        if (opcaoBebida == 1) {
            return "Cerveja";
        }
        if (opcaoBebida == 2) {
            return "Refrigerante";
        }

        if (opcaoBebida == 3) {
            return "Água";
        }

        return "Opção inválida";

    }
}
