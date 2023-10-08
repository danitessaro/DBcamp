package desafiosLogica;

import java.util.Scanner;

class CalculoComissaoVendedor {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite a descrição do Imóvel: ");
        String tipoImovel = input.nextLine();

        System.out.print("Digite o valor do imóvel: R$ ");
        double valorImovel = input.nextDouble();

        double comissao = 0.0;
        if (valorImovel >= 50000) {
            comissao = valorImovel * 0.20;
        } else if (valorImovel >= 30000) {
            comissao = valorImovel * 0.15;
        } else {
            comissao = valorImovel * 0.10;
        }

        System.out.println("Descrição do imóvel: " + tipoImovel);
        System.out.println("Valor do imóvel: R$ " + valorImovel);
        System.out.println("Valor da comissão: R$ " + comissao);

        input.close();
    }
}