package Parte2_exercicios.Ex4;

public class ConversorTemperaturaPadrao implements ConversorTemperatura{
    @Override
    public void celsiusParaFahrenheit(double celsius) {
        double fah = (9*celsius/5)+32;
        System.out.printf("%.2f celsius é igual a %.2f fahrenheit%n",celsius,fah);
    }

    @Override
    public void fahrenheitParaCelsius(double fahrenheit) {
        double celsius = 5*(fahrenheit-32)/9;
        System.out.printf("%.2f fahrenheits é igual a %.2f celsius%n",fahrenheit,celsius);
    }
}
