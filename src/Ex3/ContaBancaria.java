package Ex3;

public class ContaBancaria {
    protected double saldo;
    public double depositar(double valor){
        saldo += valor;
        System.out.println("Depositando...");
        System.out.println("Seu saldo atual é "+saldo);
        return saldo;
    }
    public double sacar(double valor){
        if (valor<=saldo){
            saldo -= valor;
        } else{
            System.out.println("Saldo insuficiente");
        }
        return saldo;
    }
    public void consultarSaldo(){
        System.out.println("Seu saldo: " + saldo);
    }

    public static void main(String[] args) {
        ContaBancaria contab = new ContaBancaria();
        contab.consultarSaldo();
        contab.depositar(50);
        contab.sacar(60);
        ContaCorrente contaC = new ContaCorrente();
        contaC.consultarSaldo();
        contaC.depositar(60);
        contaC.cobrarTarifaMensal();
    }
}
