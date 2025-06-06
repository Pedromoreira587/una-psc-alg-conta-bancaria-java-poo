// BancoApp.java
import java.util.Scanner;

public class BancoApp {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        System.out.println("--- BEM-VINDO AO BANCO UNA DIGITAL ---");
        System.out.print("Digite o nome do titular: ");
        String nome = sc.nextLine();

        System.out.print("Digite o número da conta: ");
        int numero = sc.nextInt();

        System.out.print("Digite o saldo inicial: R$ ");
        double saldoInicial = sc.nextDouble();

        
        ContaBancaria conta = new ContaBancaria(nome, numero, saldoInicial);
        System.out.println("\nConta bancária criada com sucesso.");
        System.out.println("---------------------------------");

        int opcao;
        do {
            System.out.println("\nOlá, " + conta.getNomePessoa() + "! Escolha uma operação:");
            System.out.println("1. Depositar");
            System.out.println("2. Sacar");
            System.out.println("3. Ver Saldo");
            System.out.println("0. Sair");
            System.out.print("Opção: ");
            opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Digite o valor para depósito: R$ ");
                    double valorDeposito = sc.nextDouble();
                    conta.depositar(valorDeposito);
                    break;
                case 2:
                    System.out.print("Digite o valor para saque: R$ ");
                    double valorSaque = sc.nextDouble();
                    conta.sacar(valorSaque);
                    break;
                case 3:
                    conta.obterSaldo();
                    break;
                case 0:
                    System.out.println("Obrigado por utilizar nosso sistema. Até logo!");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (opcao != 0);

        sc.close();
    }
}