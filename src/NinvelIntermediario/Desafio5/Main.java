package NinvelIntermediario.Desafio5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String accountName;

        System.out.println("O que quer criar? ");
        System.out.println("1 - Conta corrente");
        System.out.println("2 - Conta poupança");
        int accountChoice = sc.nextInt();

        switch (accountChoice) {
            case 1:
                System.out.println("Qual seu nome?");
                accountName = sc.nextLine();
                ContaCorrente obj1 = new ContaCorrente(accountName, 1234, 0);
                obj1.gerirConta();
                break;
            case 2:
                System.out.println("Qual seu nome?");
                accountName = sc.nextLine();
                ContaPoupanca obj2 = new ContaPoupanca(accountName, 1234, 0);
                obj2.gerirConta();
                break;
            default:
                System.out.println("escolha inválida");
                break;
        }

    }
}
