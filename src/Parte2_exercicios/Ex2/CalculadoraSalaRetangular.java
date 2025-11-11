package Parte2_exercicios.Ex2;

public class CalculadoraSalaRetangular implements CalculoGeometrico{
    @Override
    public void calcularArea(double altura, double largura) {
        double area = (altura*largura)/2;
        System.out.println("A área equivale à " + area);
    }

    @Override
    public void calcularPerimetro(double altura, double largura) {
        double perimetro = 2*(altura + largura);
        System.out.println("O perímetro equivale à " + perimetro);
    }
}
