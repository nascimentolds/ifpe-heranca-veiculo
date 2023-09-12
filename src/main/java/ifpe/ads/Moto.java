package ifpe.ads;

public class Moto extends Veiculo{
    private int cilindrada;

    public Moto(String marca, String ano, double preco, int cilindrada) {
        super(marca, ano, preco);
        this.cilindrada = cilindrada;
    }

    @Override
    public void imprimeInformacoes() {
        super.imprimeInformacoes();
        System.out.println("Cilindradas: " + cilindrada);
    }
}
