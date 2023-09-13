package desafiosLogica;

import java.util.Scanner;

public class CompraComDesconto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String continuar = "s";
        String resumoPedido = "";
        double valorProdutoDesconto = 0;

        while (!continuar.equals("n")) {
            System.out.println("Deseja informar algum produto? ");
            continuar = scanner.next();

            if(continuar.equals("s")) {
                System.out.println("informe o nome do produto: ");
                String nomeProduto = scanner.next();
                System.out.println("informe o preço do produto: ");
                double precoProduto = scanner.nextDouble();
                System.out.println("informe a quantidade do produto: ");
                int qtdProduto = scanner.nextInt();
                valorProdutoDesconto = calculaValorProdutoComDesconto(precoProduto,qtdProduto);
                resumoPedido += "Produto: " + nomeProduto + " Preço: R$ " + precoProduto + " Qtd.: " + qtdProduto + " Valor Total com Desconto: R$ " + valorProdutoDesconto + "\n";

            }
        }
        System.out.println(resumoPedido);


    }

    public static double calculaValorProdutoComDesconto(double precoProduto, int qtdProduto) {

        double valorSemDesconto = qtdProduto * precoProduto;
        if (qtdProduto <= 10) {
            return qtdProduto * precoProduto;
        }

        if (qtdProduto >= 11 && qtdProduto <= 20) {
            return valorSemDesconto - (valorSemDesconto * 0.10);
        }

        if (qtdProduto >= 21 && qtdProduto <= 50) {
            return valorSemDesconto - (valorSemDesconto * 0.20);
        }

        if (qtdProduto > 50) {
            return valorSemDesconto - (valorSemDesconto * 0.25);
        }

        return 0;
    }
}
