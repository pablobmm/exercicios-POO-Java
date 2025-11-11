package Ex1;

public class Carro {
    private String modelo;
    private String marca;
    private double precoAno1;
    private double precoAno2;
    private double precoAno3;
    private int qtde;
    private double motor;

    public void definirInfo(String modelo,String marca,int qtde,double motor){
        this.modelo = modelo;
        this.marca = marca;
        this.qtde = qtde;
        this.motor = motor;
    }
    public void definirPrecos(double precoAno1,double precoAno2,double precoAno3){
        this.precoAno1 = precoAno1;
        this.precoAno2 = precoAno2;
        this.precoAno3 = precoAno3;
    }

    public double menorPreco(){
        double menorPreco = precoAno1;
        if (menorPreco > precoAno2){
            menorPreco = precoAno2;
        }
        if (menorPreco > precoAno3){
            menorPreco = precoAno3;
        }
        return menorPreco;
    }
    public double maiorPreco(){
        double maiorPreco = precoAno1;
        if (maiorPreco < precoAno2){
            maiorPreco = precoAno2;
        }
        if (maiorPreco < precoAno3){
            maiorPreco = precoAno3;
        }
        return maiorPreco;
    }
    public void exibirInfo(){
        System.out.println("Modelo do carro: "+ modelo);
        System.out.println("Marca: "+ marca);
        System.out.println("Lugares: "+ qtde);
        System.out.println("Motorização: "+ motor);
        System.out.println("Preço do ano 1: "+ precoAno1);
        System.out.println("Preço do ano 2: "+ precoAno2);
        System.out.println("Preço do ano 3: "+ precoAno3);
        System.out.println("Menor Preço "+ menorPreco());
        System.out.println("Maior Preço "+ maiorPreco());
    }


    }

