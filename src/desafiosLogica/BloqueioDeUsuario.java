package desafiosLogica;

import java.util.Scanner;

public class BloqueioDeUsuario {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int tentativasIncorretas = 0;

        do {
            System.out.print("Login: ");
            String login = scanner.nextLine();

            System.out.print("Senha: ");
            String senha = scanner.nextLine();

            if (login.equals("aluno") && senha.equals("segredo")) {
                System.out.println("Bem vindo!");
                break;

            } else {
                tentativasIncorretas ++;
                System.out.println("Login ou senha incorretos");
            }
        } while(tentativasIncorretas < 3);
            if (tentativasIncorretas >= 3) {
                System.out.println("Usuario bloqueado!");
            }
        scanner.close();
    }
}
