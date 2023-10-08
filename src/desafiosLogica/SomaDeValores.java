package desafiosLogica;

public class SomaDeValores {

    public static void main(String[] args) {

        int inteiro;
        int soma = 0;

        for (int i = 0; i < 101; i++) {
            inteiro = i;
            soma += inteiro;
        }
        System.out.println("Soma de todos os valores inteiros de 1 a 100 = " + soma);
    }
}
