package Parte2_exercicios.Ex5;

public class Teste {
    public static void main(String[] args) {
        Livro livro1 = new Livro();
        System.out.println(livro1.calcularPrecoFinal(100));
        ProdutoFisico produto = new ProdutoFisico();
        System.out.println(produto.calcularPrecoFinal(50));
    }
}

//Crie uma interface Calculavel com um
// método double calcularPrecoFinal().
//  Implemente essa interface nas classes
//  Livro e ProdutoFisico, cada uma retornando
//  o preço final considerando descontos
//  ou taxas adicionais.
