package Ex3;

public class ContaCorrente extends ContaBancaria{
    private double tarifa;
    public void cobrarTarifaMensal(){
        tarifa = 20;
        saldo = saldo - tarifa;
        System.out.println("Tarifa Mensal sendo aplicada...");
        System.out.println("Seu saldo atual da conta corrente "+ saldo);
    }
}
