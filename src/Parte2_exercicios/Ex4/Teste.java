package Parte2_exercicios.Ex4;

public class Teste {
    public static void main(String[] args) {
        ConversorTemperaturaPadrao conversor = new ConversorTemperaturaPadrao();
        conversor.fahrenheitParaCelsius(10);
        conversor.celsiusParaFahrenheit(14);
    }
}
//Crie uma interface ConversorTemperatura
// com os métodos celsiusParaFahrenheit()
// e fahrenheitParaCelsius(). Implemente
// uma classe ConversorTemperaturaPadrao
// que implementa essa interface com
// as fórmulas de conversão e exibe os resultados.