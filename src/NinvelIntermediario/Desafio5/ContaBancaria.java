package NinvelIntermediario.Desafio5;

import java.util.Scanner;

public abstract class ContaBancaria implements ContaInterface {
    String name;
    int password;
    double balanceValue;

    Scanner sc = new Scanner(System.in);

    @Override
    public abstract void checkBalance();
    @Override
    public abstract double deposit(double depositValue);

    public int changePassword(){
        int newPassword;
        if (password == 1234){
            System.out.println("Qual a nova senha?");
            newPassword =  sc.nextInt();
            password = newPassword;
        }else{
            System.out.println("Qual seu nome? ");
            String accountName = sc.nextLine();
            if (accountName == name){
                System.out.println("Qual a nova senha?");
                newPassword =  sc.nextInt();
                password = newPassword;
            }
        }
        return password;
    };

    public ContaBancaria(String name, int password, double balanceValue) {
        this.name = name;
        this.password = password;
        this.balanceValue = balanceValue;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPassword() {
        return password;
    }

    public void setPassword(int password) {
        this.password = password;
    }

    public double getBalanceValue() {
        return balanceValue;
    }

    public void setBalanceValue(double balanceValue) {
        this.balanceValue = balanceValue;
    }
}
