package Parte2_exercicios.Ex5;

public class Livro implements Calculavel{
    private String nomeLivro;
    @Override
    public double calcularPrecoFinal(double preco) {
        return preco * 0.5;
    }
}
