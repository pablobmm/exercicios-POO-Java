package Ex4;

public class GeradorPrimo extends NumerosPrimos{
    public int geraProximoPrimo(int numero){
        int proximoNumero = numero + 1;
        while (!verificarPrimalidade(proximoNumero)){
            proximoNumero ++;
        }
        return proximoNumero;
    }
}
