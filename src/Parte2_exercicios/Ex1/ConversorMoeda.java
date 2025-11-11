package Parte2_exercicios.Ex1;

public class ConversorMoeda implements ConversaoFinanceira{
    public void converterDolarParaReal(double valorDolar){
        double cotacaoDolar = 5.29;
        double valorReal = valorDolar * cotacaoDolar;
        System.out.printf("O valor em real é R$%.2f%n", valorReal);
    }
}
