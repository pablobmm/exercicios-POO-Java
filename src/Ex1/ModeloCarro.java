package Ex1;

public class ModeloCarro {
    public static void main(String[] args) {
        Carro carro1 = new Carro();
        carro1.definirInfo("Quantum","Volkswagen",4,2.0);
        carro1.definirPrecos(40000,30000,25000);
        carro1.exibirInfo();
    }
}
