package NinvelIntermediario.Desafio5;

public class ContaCorrente extends ContaBancaria{

    public ContaCorrente(String name, int password, double balanceValue) {
        super(name, password, balanceValue);
    }

    @Override
    public void checkBalance() {
        System.out.println("Seu saldo é: " + balanceValue);
    }

    @Override
    public double deposit(double depositValue) {
        return + depositValue;
    }
    public void gerirConta(){
        System.out.println("O que deseja fazer? ");
        System.out.println("1 - Depositar");
        System.out.println("2 - Sacar");
        int action = sc.nextInt();
        switch (action){
            case 1:
                double depositValue = 0;
                deposit(depositValue);                break;
            case 2:
                System.out.println("Qual o valor que quer sacar?");
                double withdraw = sc.nextDouble();
                if (withdraw > balanceValue){
                    System.out.println("Valor para saque maior que valor em conta");
                }else{
                    double balanceValue =- withdraw;
                    System.out.println("Saque realizado com sucesso");
                }
                break;
        }
    };
}
