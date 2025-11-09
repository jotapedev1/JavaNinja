package NinvelIntermediario.Desafio5;

public class ContaCorrente extends ContaBancaria{

    public ContaCorrente(String name, double balanceValue, TipoConta tipoConta) {
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
        return + depositValue;
    }
    public void gerirConta(ContaBancaria contaCorrente, ContaBancaria contaPoupanca){
        int action;
        do {
            System.out.println("O que deseja fazer? ");
            System.out.println("1 - Depositar");
            System.out.println("2 - Sacar");
            System.out.println("3 - Ver saldo");
            System.out.println("4 - Transferir");
            System.out.println("5 - Verifica saldo poupança");
            System.out.println("6 - Sair");
            action = sc.nextInt();
            switch (action){
                case 1:
                    System.out.println("Digite o valor que quer depositar");
                    depositValue = sc.nextDouble();
                    deposit(depositValue);
                    if (depositValue > 0){
                        System.out.println("Deposito realizado com sucesso");
                        balanceValue += depositValue;
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
                    System.out.println("---------------");
                    checkBalance();
                    System.out.println("---------------");
                    break;
                case 4:
                    double transferValue;
                    System.out.println("Transferência de Conta CORRENTE p/ sua Conta POUPANÇA");
                    System.out.println("Há um desconto de deposito de 2% para conta POUPANÇA\n");
                    System.out.println("Digite o valor a ser transferido");
                    transferValue = sc.nextDouble();
                    transference(transferValue, this, contaPoupanca);
                    break;
                case 5:
                    double discount = contaPoupanca.balanceValue * 0.02;
                    System.out.println("O saldo de sua conta POUPANÇA é " + (contaPoupanca.balanceValue - discount));
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
