package NinvelIntermediario.Desafio5;

import java.util.Scanner;

public abstract class ContaBancaria implements ContaInterface {
    String name;
    double balanceValue;
    TipoConta tipoConta;

    Scanner sc = new Scanner(System.in);

    @Override
    public abstract void checkBalance();
    @Override
    public abstract double deposit(double depositValue);

    public void transference(double transferValue, ContaBancaria remetente, ContaBancaria destinatario){
        if (transferValue > 0){
            if (remetente.balanceValue >= transferValue){
                remetente.balanceValue -= transferValue;
                destinatario.balanceValue += transferValue;
                System.out.println("Operação efetuada com sucesso!");
            } else {
                System.out.println("Saldo insuficiente!");
            }
        } else {
            System.out.println("Valor inválido!");
        }
    }


    public ContaBancaria(String name, double balanceValue, TipoConta tipoConta) {
        this.name = name;
        this.balanceValue = balanceValue;
        this.tipoConta = tipoConta;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBalanceValue() {
        return balanceValue;
    }

    public void setBalanceValue(double balanceValue) {
        this.balanceValue = balanceValue;
    }
}
