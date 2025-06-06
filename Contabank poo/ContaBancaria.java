public class ContaBancaria {

    // Atributos da conta
    private String nomePessoa;
    private int numeroConta;
    private double saldo;

    // Construtor
    public ContaBancaria(String nomePessoa, int numeroConta, double saldoInicial) {
        this.nomePessoa = nomePessoa;
        this.numeroConta = numeroConta;
        this.saldo = saldoInicial;
    }

    
    public void depositar(double valor) {
        this.saldo += valor;
        System.out.printf("Depósito de R$ %.2f realizado com sucesso.%n", valor);
    }

    public void sacar(double valor) {
        if (valor > 5000) {
            System.out.println("Valor do saque acima do permitido.");
        } else if (valor > this.saldo) {
            System.out.println("Saldo insuficiente para realizar a operação.");
        } else {
            this.saldo -= valor;
            System.out.printf("Saque de R$ %.2f realizado com sucesso.%n", valor);
        }
    }

   
    public void obterSaldo() {
        System.out.printf("Saldo disponível: R$ %.2f%n", this.saldo);
    }
    
  
    public String getNomePessoa() {
        return this.nomePessoa;
    }
}