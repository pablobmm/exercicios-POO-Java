package Ex4;

public class NumerosPrimos {

    public boolean verificarPrimalidade(int numero){

        if(numero < 1){
            return false;
        }
        for(int i=2; i * i <= numero;i++){
            if (numero % i == 0){
                return false;
            }
        }
        return true;
    }

    public void listarPrimos(int limiteSuperior){
        System.out.println("Números primos até " + limiteSuperior + ": ");
        for (int i = 2; i <= limiteSuperior; i++) {
            if (verificarPrimalidade(i)) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        NumerosPrimos n = new NumerosPrimos();
        n.listarPrimos(15);
        VerificadorPrimo verificador = new VerificadorPrimo();
        verificador.verificarSeEhPrimo(17);
        GeradorPrimo gerador = new GeradorPrimo();
        int proximoPrimo = gerador.geraProximoPrimo(29);
        System.out.println("O próximo primo é "+ proximoPrimo);
    }
}
