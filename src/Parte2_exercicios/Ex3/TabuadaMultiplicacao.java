package Parte2_exercicios.Ex3;

public class TabuadaMultiplicacao implements Tabuada{
    @Override
    public void mostrarTabuada(int numero) {
        System.out.println("Tabuada do número: "+ numero);
        for (int i = 1; i < 11; i++){
            int resultado = numero * i;
            System.out.println(numero + "x"+ i + "="+ resultado);
        }
    }
}
