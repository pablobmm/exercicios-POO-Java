package Parte2_exercicios.Ex2;

public class Teste {
    public static void main(String[] args) {
        CalculadoraSalaRetangular calculadora = new CalculadoraSalaRetangular();
        calculadora.calcularArea(5,10);
        calculadora.calcularPerimetro(5,10);
    }
}
//Crie uma classe CalculadoraSalaRetangular
// que implementa uma interface
// CalculoGeometrico com os métodos calcularArea()
// e calcularPerimetro() para calcular
// a área e o perímetro de uma sala retangular.
// A classe deve receber altura e largura
// como parâmetros.