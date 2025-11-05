package Ex2;

import Ex1.Carro;

public class Animal {
    public void emitirSom(){
        System.out.println("Som genérico");
    }

    public static void main(String[] args) {
        Cachorro Thor = new Cachorro();
        Thor.emitirSom();
        Thor.brincarComBolinha();
        Gato Romeu = new Gato();
        Romeu.emitirSom();
        Romeu.arranharMoveis();
    }
}
