package NinvelIntermediario.Desafio5;

public class ContaPoupanca extends ContaBancaria{

    public ContaPoupanca(String name, double balanceValue, TipoConta tipoConta) {
        super(name, balanceValue, tipoConta);
    }

    double depositValue;
    double withdraw;

    @Override
    public void checkBalance() {
        System.out.println("Seu saldo é: " + balanceValue);
    }

    @Override
    public double deposit(double depositValue) {
        double discount = depositValue * 0.02;
        return (depositValue - discount);
    }
    public void gerirConta(ContaBancaria contaCorrente, ContaBancaria contaPoupanca){
        int action;
        do {
            System.out.println("O que deseja fazer? ");
            System.out.println("1 - Depositar");
            System.out.println("2 - Sacar");
            System.out.println("3 - Ver saldo");
            System.out.println("4 - Transferir");
            System.out.println("5 - Verifica saldo conta corrente");
            System.out.println("6 - Sair");
            action = sc.nextInt();
            switch (action){
                case 1:
                    System.out.println("Digite o valor que quer depositar");
                    depositValue = sc.nextDouble();
                    double depositWithDiscount = deposit(depositValue);
                    if (depositValue > 0){
                        System.out.println("Deposito realizado com sucesso");
                        System.out.println("Foi debitado 2% do valor do deposito");
                        balanceValue += depositWithDiscount;
                    }else{
                        System.out.println("Falhou");
                    }
                    break;
                case 2:
                    System.out.println("Qual o valor que quer sacar?");
                    withdraw = sc.nextDouble();

                    if (withdraw > balanceValue){
                        System.out.println("Valor para saque maior que valor em conta");
                    }else{
                        System.out.println("Saque realizado com sucesso");
                        balanceValue = balanceValue - withdraw;
                    }
                    break;
                case 3:
                    checkBalance();
                    System.out.println("|-|-|-|-|-|-|-|-|-|-|");
                    break;
                case 4:
                    double transferValue;
                    System.out.println("Transferência de Conta POUPANÇA p/ sua Conta CORRENTE\n");
                    System.out.println("Digite o valor a ser transferido");
                    transferValue = sc.nextDouble();
                    transference(transferValue, this, contaCorrente);
                    break;
                case 5:
                    System.out.println("O saldo da sua conta corrente é "+ contaCorrente.balanceValue);
                    break;
                case 6:
                    System.out.println("Saindo...");
                    System.exit(0);
                default:
                    System.out.println("Escolha inválida");
            }
        }while (action != 6);
    }
}
