package NinvelIntermediario.Desafio5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String accountName;

        ContaCorrente obj1 = null;
        ContaPoupanca obj2 = null;

        System.out.println("O que quer criar? ");
        System.out.println("1 - Conta corrente");
        System.out.println("2 - Conta poupança");
        int accountChoice = sc.nextInt();
        sc.nextLine(); // limpa ENTER

        switch (accountChoice) {
            case 1:
                System.out.println("Qual seu nome?");
                accountName = sc.nextLine();
                obj1 = new ContaCorrente(accountName, 0,TipoConta.CORRENTE);
                ContaPoupanca Poupanca = new ContaPoupanca(accountName, 0, TipoConta.POUPANCA);
                obj1.gerirConta(obj1, Poupanca);
                break;
            case 2:
                System.out.println("Qual seu nome?");
                accountName = sc.nextLine();
                obj2 = new ContaPoupanca(accountName, 0, TipoConta.POUPANCA);
                ContaCorrente Corrente = new ContaCorrente(accountName, 0, TipoConta.CORRENTE);
                obj2.gerirConta(Corrente, obj2);
                break;
            default:
                System.out.println("escolha inválida");
                break;
        }
    }
}
