package Parte2_exercicios.Ex5;

public class ProdutoFisico implements Calculavel{
    @Override
    public double calcularPrecoFinal(double preco) {
        return preco * 1.02;
    }
}
